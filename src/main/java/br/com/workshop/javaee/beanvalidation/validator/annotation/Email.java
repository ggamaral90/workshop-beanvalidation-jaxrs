package br.com.workshop.javaee.beanvalidation.validator.annotation;

import br.com.workshop.javaee.beanvalidation.validator.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by gabriel on 15/05/16.
 */
@Constraint(validatedBy = EmailValidator.class)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {

    String message() default "Email inválid";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
