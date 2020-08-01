package cn.com.creavalue.exception.dispose.handler;

import cn.com.creavalue.exception.dispose.ExceptionDisposeProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;


@ControllerAdvice
public class ResponseDisposeAdvice implements ResponseBodyAdvice {

  private ExceptionDisposeProperties exceptionDisposeProperties;

  private ApplicationContext applicationContext;

  public ResponseDisposeAdvice(ApplicationContext applicationContext,
                               ExceptionDisposeProperties exceptionDisposeProperties) {
    this.applicationContext = applicationContext;
    this.exceptionDisposeProperties = exceptionDisposeProperties;
  }

  @Override
  public boolean supports(MethodParameter methodParameter, Class aClass) {
    //TODO
    return false;
  }

  @Override
  public Object beforeBodyWrite(Object o, MethodParameter methodParameter,
                                MediaType mediaType, Class aClass,
                                ServerHttpRequest serverHttpRequest,
                                ServerHttpResponse serverHttpResponse) {
    return null;
  }
}
