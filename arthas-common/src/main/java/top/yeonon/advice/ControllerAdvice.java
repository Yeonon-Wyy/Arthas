package top.yeonon.advice;

import top.yeonon.advice.annotation.IgnoreAdvice;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import top.yeonon.response.ResponseCode;
import top.yeonon.response.ServerResponse;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:20
 **/
@RestControllerAdvice
public class ControllerAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        //check type whether have IgnoreAdvice
        if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreAdvice.class)) {
            return false;
        }

        //check method whether have IgnoreAdvice
        if (methodParameter.getMethod() != null && methodParameter.getMethod().isAnnotationPresent(IgnoreAdvice.class)) {
            return false;
        }

        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setCode(ResponseCode.SUCCESS.getCode());
        serverResponse.setMessage(ResponseCode.SUCCESS.getDescription());

        //if body equals null, just return response without data
        if (o == null) {
            return serverResponse;
        }

        //if type of body is ServerResponse, just return this body
        if (o instanceof ServerResponse) {
            return o;
        }

        //set body to response data
        serverResponse.setData(o);
        return serverResponse;
    }
}
