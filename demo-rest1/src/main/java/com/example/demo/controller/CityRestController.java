
package com.example.demo.controller;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.City;
import com.example.demo.service.CityService;

import java.util.List;

/**
 * Created by V-zar on 2017/7/2.
 */


@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;


    @RequestMapping(value = "/demo/hello/",method = RequestMethod.GET)
//    @ResponseBody
//    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!      :-)        :-)  ";
    }


    @RequestMapping(value = "/demo/city/{id}",method = RequestMethod.GET)
    public City findOneCity(@PathVariable Long id){
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/demo/city",method = RequestMethod.GET)
    public List<City> findAllCity(){
        return cityService.findAllCity();
    }

    @RequestMapping(value = "/demo/city",method = RequestMethod.POST)
    public void createCity(@RequestBody City city){
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/demo/city",method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city){
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/demo/city/{id}",method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id){
        cityService.deleteCity(id);
    }


}
