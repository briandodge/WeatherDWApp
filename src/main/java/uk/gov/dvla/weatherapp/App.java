package uk.gov.dvla.weatherapp;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import uk.gov.dvla.weatherapp.resources.WeatherResource;

public class App extends Application<WeatherConfig> {


    public static void main(String[] args) throws Exception {
        new App().run(args);
    }



    @Override
    public void run(WeatherConfig config, Environment env) throws Exception {
        env.jersey().register(new WeatherResource());
    }
}
