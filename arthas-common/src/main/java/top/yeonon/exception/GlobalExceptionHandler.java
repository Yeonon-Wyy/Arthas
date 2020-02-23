package top.yeonon.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.yeonon.response.ServerResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:41
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ArthasException.class)
    public ServerResponse arthasExceptionHandler(HttpServletRequest request, ArthasException exception) {
        String message = String.format("request uri %s and method %s occur an error : %s",
                request.getRequestURI(),
                request.getMethod(),
                exception.getMessage());

        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setCode(exception.getCode());
        serverResponse.setMessage(message);
        return serverResponse;
    }
}
