package org.launchcode.Piri.models;

import java.util.Objects;

public class City {

    private int zipcode; //id?
    private int latitude;
    private int longitude;
    private String cityName;
    private String state;
    private String county;

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }


    /* private int overallRating;
        private int safetyRating;
        private int affordabilityRating;
        private int jobGrowth;

    */

    @Override
    public String toString() {
        return "City{" +
                "zipcode=" + zipcode +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", cityName='" + cityName + '\'' +
                ", state='" + state + '\'' +
                ", county='" + county + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return zipcode == city.zipcode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipcode);
    }
}
