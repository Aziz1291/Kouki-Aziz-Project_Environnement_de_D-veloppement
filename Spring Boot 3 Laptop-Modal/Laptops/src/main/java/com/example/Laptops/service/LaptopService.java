package com.example.Laptops.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.Laptops.entities.Laptop;

public interface LaptopService {
	 Laptop saveLaptop(Laptop l); 
	 Laptop updateLaptop(Laptop l); 
	 void deleteLaptop(Laptop l); 
	 void deleteLaptopById(Long id); 
	 Laptop getLaptop(Long id); 
	 List<Laptop> getAllLaptops();
	 Page<Laptop> getAllLaptopsParPage(int page, int size);
}