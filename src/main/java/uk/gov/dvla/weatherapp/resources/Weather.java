package uk.gov.dvla.weatherapp.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/weather")
public class Weather {


    @GET
    @Path("/")
    public Response getWeather(){
        return Response.ok().build();
    }




}
