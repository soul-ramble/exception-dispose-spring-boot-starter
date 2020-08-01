package cn.com.creavalue.exception.dispose.configuration;

import cn.com.creavalue.exception.dispose.handler.ExceptionDisposeAdvice;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExceptionDisposeAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public ExceptionDisposeAdvice exceptionDisposeAdvice() {
    return new ExceptionDisposeAdvice();
  }
}
