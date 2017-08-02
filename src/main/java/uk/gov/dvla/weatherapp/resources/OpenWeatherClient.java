package uk.gov.dvla.weatherapp.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.client.ClientConfig;
import uk.gov.dvla.weatherapp.App;
import uk.gov.dvla.weatherapp.representations.WeatherData;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;


public class OpenWeatherClient {

    private static final String OPEN_WEATHER_URI = "http://api.openweathermap.org/data/2.5/";
    private static final String OPEN_WEATHER_ACTION = "weather";
    private final String location;
    private final String apiKey;

    public OpenWeatherClient(String location, String apikey){
        this.location = location;
        this.apiKey = apikey;
    }

    private WebTarget target;

    private static URI getBaseURI(){
        return UriBuilder.fromUri(OPEN_WEATHER_URI).build();
    }

    public WeatherData getWeatherData(){
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        target = client.target(getBaseURI());

        WeatherData weatherData = null;
        ObjectMapper mapper = new ObjectMapper();
        String response = target.path(OPEN_WEATHER_ACTION).queryParam("q",this.location)
                .queryParam("appid", this.apiKey)
                .request().accept(MediaType.APPLICATION_JSON).get(String.class);
        try {
            App.LOGGER.info("JSON: " + response);
            weatherData = mapper.readValue(response, WeatherData.class);
            System.out.println(weatherData.getVisibilty());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherData;
    }


}
