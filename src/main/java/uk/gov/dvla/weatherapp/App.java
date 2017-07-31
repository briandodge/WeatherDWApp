package uk.gov.dvla.weatherapp;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<WeatherConfig> {


    public static void main(String[] args) throws Exception {
        new App().run();
    }



    @Override
    public void run(WeatherConfig config, Environment env) throws Exception {

    }
}
