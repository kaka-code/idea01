package com.example.demo.service.impl;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.CityDao;
import com.example.demo.domain.City;
import com.example.demo.service.CityService;

import java.util.List;

/**
 * Created by V-zar on 2017/7/2.
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }
}
