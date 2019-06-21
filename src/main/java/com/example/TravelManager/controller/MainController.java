package com.example.TravelManager.controller;

import com.example.TravelManager.model.City;
import com.example.TravelManager.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "TravelManager")
public class MainController {

    @Autowired
    CityRepo cityRepo;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    List<City> getCities(){
        List<City> cities = cityRepo.findAll();
        return cities;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST,  produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    City addCity(@Valid @RequestBody City city){
        return cityRepo.save(city);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    City editCity(@Valid @RequestBody City city){
        return cityRepo.save(city);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    public void deleteCity(@PathVariable("id") int id){
        cityRepo.delete(cityRepo.getOne(id));
    }

    @RequestMapping(value = "/info/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE} )
    @ResponseBody
    Optional<City> getCity(@PathVariable("id") int id){
        return cityRepo.findById(id);
    }


}

