package com.example.demo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.Entities.City;


@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
