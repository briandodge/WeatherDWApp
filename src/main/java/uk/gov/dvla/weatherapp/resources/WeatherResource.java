package uk.gov.dvla.weatherapp.resources;


import uk.gov.dvla.weatherapp.representations.WeatherData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/weather")
@Produces(MediaType.APPLICATION_JSON)
public class WeatherResource {


    @GET
    @Path("/")
    public Response getWeather(){

        OpenWeatherClient client = new OpenWeatherClient();
        WeatherData result = client.getWeatherData();



        return Response.ok(result).build();
    }




}
