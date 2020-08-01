package cn.com.creavalue.exception.dispose.configuration;

import cn.com.creavalue.exception.dispose.ExceptionDisposeProperties;
import cn.com.creavalue.exception.dispose.handler.ResponseDisposeAdvice;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan({"cn.com.creavalue.exception.dispose.handler"})
@EnableConfigurationProperties(ExceptionDisposeProperties.class)
public class ResponseAutoConfiguration {

  @Bean
  @ConditionalOnMissingBean
  public ResponseDisposeAdvice responseHandler(ApplicationContext applicationContext,
                                               ExceptionDisposeProperties exceptionDisposeProperties) {
    return new ResponseDisposeAdvice(applicationContext, exceptionDisposeProperties);
  }
}
