package com.validation.beanValidation.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { TotalPorTipoValidator.class })
@Documented
public @interface TotalPorTipo {

	String message() default "{valor inválido para o tipo da venda.}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
