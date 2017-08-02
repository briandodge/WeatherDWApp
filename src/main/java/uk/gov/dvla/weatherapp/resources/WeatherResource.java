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


    private final String location;
    private final String apiKey;

    public WeatherResource(String location, String apikey){
        this.location = location;
        this.apiKey = apikey;
    }

    @GET
    public Response getWeather(){
        OpenWeatherClient client = new OpenWeatherClient(location, apiKey);
        WeatherData result = client.getWeatherData();
        if(result != null) {
            return Response.ok(result).build();
        } else {
            return Response.noContent().build();
        }
    }
}
