package uk.gov.dvla.weatherapp.representations;


public class WeatherData {

    private Coord coord;
    private Weather weather;
    private String base;
    private Main main;
    private float visibilty;
    private Wind wind;
    private Clouds clouds;
    private Rain rain;
    private Snow snow;
    private double dt;
    private Sys sys;

    private class Coord{
        float lon;
        float late;
    }

    private class Weather {
        long id;
        String main;
        String description;
        String icon;
    }

    private class Main{
        float temp;
        float pressure;
        float humidity;
        float temp_min;
        float temp_max;
        float sea_level;
        float grnd_level;
    }

    private class Wind{
        float speed;
        float deg;
    }

    private class Clouds {
        float all;
    }

    private class Rain{
        float _3h;
    }

    private class Snow{
        float _3h;
    }

    private class Sys{
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
