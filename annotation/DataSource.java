package com.yunpi.shuili.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
