package com.example.Laptops.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Laptops.entities.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
