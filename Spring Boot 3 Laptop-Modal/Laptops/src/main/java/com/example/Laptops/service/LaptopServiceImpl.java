package com.example.Laptops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.Laptops.entities.Laptop;
import com.example.Laptops.repos.LaptopRepository;
@Service
public class LaptopServiceImpl implements LaptopService{
	@Autowired
	LaptopRepository laptopRepository;

	@Override
	public Laptop saveLaptop(Laptop l) {
		return laptopRepository.save(l);
	}

	@Override
	public Laptop updateLaptop(Laptop l) {
		return laptopRepository.save(l);
	}

	@Override
	public void deleteLaptop(Laptop l) {
		laptopRepository.delete(l);
		
	}

	@Override
	public void deleteLaptopById(Long id) {
		laptopRepository.deleteById(id);
		
	}

	@Override
	public Laptop getLaptop(Long id) {
		return laptopRepository.findById(id).get();
	}

	@Override
	public List<Laptop> getAllLaptops() {
		return laptopRepository.findAll();
	}
	@Override 
	public Page<Laptop> getAllLaptopsParPage(int page, int size) { 
	return laptopRepository.findAll(PageRequest.of(page, size)); 
	}

}
