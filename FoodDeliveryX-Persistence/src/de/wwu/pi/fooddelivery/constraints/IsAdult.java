package de.wwu.pi.fooddelivery.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckIsAdultValidator.class)
@Documented
public @interface IsAdult {

    String message() default "is no adult";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}