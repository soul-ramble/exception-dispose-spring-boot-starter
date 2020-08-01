package cn.com.creavalue.exception.dispose.annotation;


import cn.com.creavalue.exception.dispose.configuration.ResponseAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(ResponseAutoConfiguration.class)
public @interface EnableResponseDispose {
}
