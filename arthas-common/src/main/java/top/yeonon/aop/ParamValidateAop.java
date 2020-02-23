package top.yeonon.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import top.yeonon.exception.ArthasException;
import top.yeonon.request.RequestVo;
import top.yeonon.response.ResponseCode;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:38
 **/
@Aspect
@Component
public class ParamValidateAop {

    @Pointcut("@annotation(ParamValidate)")
    public void validateParam() {

    }

    @Before("validateParam()")
    public void doBefore(JoinPoint joinPoint) throws ArthasException {
        for (Object arg : joinPoint.getArgs()) {
            if (arg instanceof RequestVo) {
                RequestVo requestVo = (RequestVo)arg;
                if (!requestVo.validate()) {
                    throw new ArthasException(ResponseCode.REQUEST_PARAM_ERROR.getCode(),
                            ResponseCode.REQUEST_PARAM_ERROR.getDescription());
                }
            }
        }
    }
}
