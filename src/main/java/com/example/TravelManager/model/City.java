package com.example.TravelManager.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "travel_cities")

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityId;

    @NotEmpty
    @Column(name = "city_name")
    private String cityName;

    @NotEmpty
    @Column(name = "city_description")
    private String cityDescription;

    public City() {
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityDescription() {
        return cityDescription;
    }

    public void setCityDescription(String cityDescription) {
        this.cityDescription = cityDescription;
    }

    @Override
    public String toString() {
        return  "cityName='" + cityName + '\'' +
                ", description='" + cityDescription + '\'' ;
    }
}
