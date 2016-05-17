package br.com.workshop.beanvalidation.domain;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by gabriel on 15/05/16.
 */
public class UserTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    public void nameIsNull() {
        User user = new User(null, "developer@buscapecompany.com");
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        assertEquals(1, constraintViolations.size());
        assertEquals("Name is required", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void emailIsNull() {
        User user = new User("Developer Buscapé", null);
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        assertEquals(1, constraintViolations.size());
        assertEquals("may not be null", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void emailIsInvalid() {
        User user = new User("Developer Buscapé", "developer@buscapecompany");
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        assertEquals(1, constraintViolations.size());
        assertEquals("Email inválido", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void userIsValid() {
        User user = new User("Developer Buscapé", "developer@buscapecompany.com");
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        assertTrue(constraintViolations.isEmpty());
    }
}
