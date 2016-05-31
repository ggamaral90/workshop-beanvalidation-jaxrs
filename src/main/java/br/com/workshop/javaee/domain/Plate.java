package br.com.workshop.javaee.domain;

import java.io.Serializable;

/**
 * Created by gabriel on 29/05/16.
 */
public class Plate implements Serializable {

    private String value;

    public Plate(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plate plate = (Plate) o;

        return !(value != null ? !value.equals(plate.value) : plate.value != null);

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
