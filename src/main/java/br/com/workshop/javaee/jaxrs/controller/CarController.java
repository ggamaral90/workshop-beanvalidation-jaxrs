package br.com.workshop.javaee.jaxrs.controller;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.workshop.javaee.domain.Car;
import br.com.workshop.javaee.jaxrs.service.CarService;

/**
 * Created by gabriel on 29/05/16.
 */
@Path("/car")
@Consumes(MediaType.APPLICATION_JSON)
public class CarController {

    private CarService carService = new CarService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAll() {
        return Response.ok().entity(carService.list()).build();
    }

    @POST
    public void create(@Valid Car car) {
        carService.save(car);
    }
}
