package io.educative.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=HeadToHeadConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HeadToHead {
	public String message () default "Value must have digits in ##-## format.";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}