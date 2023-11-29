package com.cib.sensitive.annotation;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
//@JacksonAnnotationsInside
//@JsonSerialize(using = JacksonSensitiveSerializer.class)
public @interface Desensitization {
}
