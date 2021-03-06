package com.harmony.devops.common.annotation.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 短信认证
 * @author 葛文镇
 */
@Target({ElementType.FIELD,ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=MsgCodeValidator.class)
public @interface MsgCode {
    String message() default"短信验证码格式错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
