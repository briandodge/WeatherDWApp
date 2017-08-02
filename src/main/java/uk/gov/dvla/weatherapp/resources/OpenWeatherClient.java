package uk.gov.dvla.weatherapp.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.client.ClientConfig;
import uk.gov.dvla.weatherapp.representations.WeatherData;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;


public class OpenWeatherClient {

    private WebTarget target;


    private static URI getBaseURI(){
        return UriBuilder.fromUri("api.openweathermap.org/data/2.5/").build();
    }

    public String getWeatherData(){
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        target = client.target(getBaseURI());

        WeatherData weatherData = null;
        ObjectMapper mapper = new ObjectMapper();
        String response = target.path("weather").queryParam("q","london")
                .queryParam("appid", "04107284019355e819938452495e8879")
                .request().accept(MediaType.APPLICATION_JSON).get(String.class);

        return response;
    }


}
