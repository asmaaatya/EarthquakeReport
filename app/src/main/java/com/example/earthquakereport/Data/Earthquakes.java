package com.example.earthquakereport.Data;

public class Earthquakes {
    String magnitude;
    String location;
    Long date;

    public Earthquakes(String magnitude, String location, Long date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date=date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
