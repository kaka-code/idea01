package com.example.demo.service;

import com.example.demo.domain.City;

import java.util.List;

/**
 * 城市业务逻辑接口
 *
 * Created by V-zar on 2017/7/2.
 */
public interface CityService {

    /**
     * 获取城市列表
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市id寻找城市
     * @param id
     * @return
     */
    City findCityById(Long id);

    /**
     * 保存城市信息
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 更新城市信息
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     * 删除城市信息
     * @param id
     * @return
     */
    Long deleteCity(Long id);

}

