package com.zhengtou.cf.common.annotation.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 手机号认证
 * @author 葛文镇
 */
@Target({ElementType.PARAMETER,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=IdNoValidator.class)
public @interface IdNo {
    String message() default"身份证格式错误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
