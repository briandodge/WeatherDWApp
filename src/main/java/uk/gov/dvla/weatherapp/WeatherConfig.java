package uk.gov.dvla.weatherapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class WeatherConfig extends Configuration {


    @JsonProperty
    private String location;

    @JsonProperty
    private String APIKey;

    public String getLocation() {
        return location;
    }

    public String getAPIKey() {
        return APIKey;
    }
}
