package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.Entities.City;
import com.example.demo1.Repository.CityRepository;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> obtener_todas_las_ciudades() {
        return cityRepository.findAll();
    }
}

