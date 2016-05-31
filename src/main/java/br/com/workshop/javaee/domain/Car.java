package br.com.workshop.javaee.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by gabriel on 29/05/16.
 */
public class Car implements Serializable {

	private static final long serialVersionUID = 2371337822024284289L;
	
	@NotBlank
    private String model;
    @NotBlank
    private String brand;
    @NotNull
    private Plate plate;

    public Car() {
	}
    
    public Car(String brand, String model, Plate plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Plate getPlate() {
        return plate;
    }
}
