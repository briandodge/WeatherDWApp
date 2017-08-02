package uk.gov.dvla.weatherapp;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import uk.gov.dvla.weatherapp.resources.WeatherResource;

public class App extends Application<WeatherConfig> {

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    public void initialize(Bootstrap<WeatherConfig> b){

    }

    @Override
    public void run(WeatherConfig config, Environment env) throws Exception {
        LOGGER.info("Method APP#run() called");
        LOGGER.info("Location Requested: " + config.getLocation());
        LOGGER.info("APIKey applied: " + config.getAPIKey());
        env.jersey().register(new WeatherResource(config.getLocation(), config.getAPIKey()));
    }
}
