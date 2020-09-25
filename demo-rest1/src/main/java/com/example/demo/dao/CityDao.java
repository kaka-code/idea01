package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import com.example.demo.domain.City;

import java.util.List;

/**
 * 城市DAO接口类
 *
 * Created by V-zar on 2017/7/2.
 */
public interface CityDao {

    /**
     * 获取城市信息列表
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据id获取城市信息
     * @param id
     * @return
     */
    City findById(@Param("id") Long id);

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
