package br.com.workshop.javaee.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by gabriel on 15/05/16.
 */
public class User implements Serializable {

    @NotNull(message = "Name is required")
    private String name;

    @NotNull
    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Email inválid")
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
