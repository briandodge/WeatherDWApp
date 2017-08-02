package uk.gov.dvla.weatherapp.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/weather")
public class WeatherResource {


    @GET
    @Path("/")
    public Response getWeather(){

        OpenWeatherClient client = new OpenWeatherClient();
        String result = client.getWeatherData();
        System.out.println(result);


        return Response.ok().build();
    }




}
