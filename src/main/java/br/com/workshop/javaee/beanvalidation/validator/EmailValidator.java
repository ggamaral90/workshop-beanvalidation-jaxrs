package br.com.workshop.javaee.beanvalidation.validator;

import br.com.workshop.javaee.beanvalidation.validator.annotation.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by gabriel on 15/05/16.
 */
public class EmailValidator implements ConstraintValidator<Email, String> {

    private Pattern pattern = Pattern.compile(".+@.+\\.[a-z]+");

    @Override
    public void initialize(Email constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
