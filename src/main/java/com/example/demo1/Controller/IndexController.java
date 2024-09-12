package com.example.demo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.Entities.City;
import com.example.demo1.Service.CityService;


@RestController
public class IndexController {

    @Autowired
    private CityService cityservice;

    @GetMapping({"/", "index"})
    public List<City> Index() {
        return cityservice.obtener_todas_las_ciudades();
    }
    
}
