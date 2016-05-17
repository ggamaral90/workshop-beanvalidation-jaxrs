package br.com.workshop.beanvalidation.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by gabriel on 15/05/16.
 */
public class User {

    @NotNull(message = "Name is required")
    private String name;

    @NotNull
    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Email inválido")
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
