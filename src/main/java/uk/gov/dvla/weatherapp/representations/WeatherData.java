package uk.gov.dvla.weatherapp.representations;


public class WeatherData {

    private class Coord{
        float lon;
        float late;
    }

    private class Weather{
        long id;
        String main;
        String description;
        String icon;
    }

    private String base;

    private class Main{
        float temp;
        float pressure;
        float humidity;
        float temp_min;
        float temp_max;
    }

    private float visibilty;

    private class Wind{
        float speed;
        float deg;
    }

    private class Cloads{
        float all;
    }

    private double dt;

    private class sys{
        int type;
        int id;
        float message;
        String country;
        double sunrise;
        double sunset;
    }

    private int id;
    String name;
    float cod;



}
