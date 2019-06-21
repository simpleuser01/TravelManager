package com.example.TravelManager.repository;

import com.example.TravelManager.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City, Integer> {
    City findByCityName(String cityName);
}
