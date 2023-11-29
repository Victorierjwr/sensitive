package com.cib.sensitive.annotation;

import java.lang.annotation.*;

/**
 * Ignore sensitive for api
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface IgnoreDesensitization {
}
