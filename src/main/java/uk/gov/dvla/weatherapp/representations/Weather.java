package uk.gov.dvla.weatherapp.representations;

public class Weather {


    private long id;
    private String main;
    private String description;
    private String icon;

    public Weather(){ }
    public long getId() { return id; }
    public String getMain() { return main; }
    public String getDescription() { return description;  }
    public String getIcon() { return icon; }

}
