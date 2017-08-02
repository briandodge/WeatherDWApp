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

    public class Coord{
        float lon;
        float lat;

        public Coord(){}

        public float getLon() {
            return lon;
        }

        public float getLat() {
            return lat;
        }
    }

    public class Weather {
        long id;
        String main;
        String description;
        String icon;

        public Weather(){}

        public long getId() {
            return id;
        }

        public String getMain() {
            return main;
        }

        public String getDescription() {
            return description;
        }

        public String getIcon() {
            return icon;
        }
    }

    public class Main{
        float temp;
        float pressure;
        float humidity;
        float temp_min;
        float temp_max;
        float sea_level;
        float grnd_level;

        public Main(){}


        public float getTemp() {
            return temp;
        }

        public float getPressure() {
            return pressure;
        }

        public float getHumidity() {
            return humidity;
        }

        public float getTemp_min() {
            return temp_min;
        }

        public float getTemp_max() {
            return temp_max;
        }

        public float getSea_level() {
            return sea_level;
        }

        public float getGrnd_level() {
            return grnd_level;
        }
    }

    public class Wind{
        float speed;
        float deg;

        public Wind(){}

        public float getSpeed() {
            return speed;
        }

        public float getDeg() {
            return deg;
        }
    }

    private class Clouds {
        float all;

        public Clouds(){}

        public float getAll() {
            return all;
        }
    }

    public class Rain{
        float _3h;

        public Rain(){}

        public float get_3h() {
            return _3h;
        }
    }

    public class Snow{
        float _3h;

        public Snow(){}

        public float get_3h() {
            return _3h;
        }
    }

    public class Sys{
        int type;
        int id;
        float message;
        String country;
        double sunrise;
        double sunset;

        public Sys(){}

        public int getType() {
            return type;
        }

        public int getId() {
            return id;
        }

        public float getMessage() {
            return message;
        }

        public String getCountry() {
            return country;
        }

        public double getSunrise() {
            return sunrise;
        }

        public double getSunset() {
            return sunset;
        }
    }

    private int id;
    String name;
    float cod;

    public WeatherData(){}

    public Coord getCoord() {
        return coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public float getVisibilty() {
        return visibilty;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public double getDt() {
        return dt;
    }

    public Sys getSys() {
        return sys;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCod() {
        return cod;
    }
}
