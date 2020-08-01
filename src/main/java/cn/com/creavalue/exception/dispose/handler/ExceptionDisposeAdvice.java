package cn.com.creavalue.exception.dispose.handler;

import cn.com.creavalue.exception.dispose.core.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionDisposeAdvice {

  @ExceptionHandler(value = Exception.class)
  public Response handlerException(Exception e) {
    return new Response(500, "服务端异常", null);
  }
}



