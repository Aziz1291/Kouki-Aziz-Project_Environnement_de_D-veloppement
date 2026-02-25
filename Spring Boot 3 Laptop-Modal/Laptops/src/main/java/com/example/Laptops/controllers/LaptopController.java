package com.example.Laptops.controllers;

import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.ModelMap; 
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam;
import com.example.Laptops.service.LaptopService; 
import com.example.Laptops.entities.Laptop;  

@Controller
public class LaptopController { 
 @Autowired 
 LaptopService laptopService; 
 
   @RequestMapping("/listeLaptops") 
 public String listeLaptops(ModelMap modelMap,
		 @RequestParam (name="page",defaultValue = "0") int page, 
		 @RequestParam (name="size", defaultValue = "8") int size) 
 { 
	   Page<Laptop> laps = laptopService.getAllLaptopsParPage(page, size); 
	   modelMap.addAttribute("laptops", laps); 
	   modelMap.addAttribute("pages", new int[laps.getTotalPages()]);  
	   modelMap.addAttribute("currentPage", page);
	   modelMap.addAttribute("size", size);
  return "listeLaptops";  
 } 
   @RequestMapping("/supprimerLaptop") 
   public String supprimerLaptop(@RequestParam("id") Long id, 
   ModelMap modelMap, 
   @RequestParam (name="page",defaultValue = "0") int page, 
   @RequestParam (name="size", defaultValue = "8") int size) 
   { 
   laptopService.deleteLaptopById(id);
   Page<Laptop> laps = laptopService.getAllLaptopsParPage(page, size); 
		    
		   modelMap.addAttribute("laptops", laps);   
		   modelMap.addAttribute("pages", new int[laps.getTotalPages()]);  
		   modelMap.addAttribute("currentPage", page);  
		   modelMap.addAttribute("size", size);  
		   return "listeLaptops"; 
   }
   @RequestMapping("/showCreate") 
 public String showCreate() 
 { 
  return "createLaptop"; 
 } 
  
 @RequestMapping("/saveLaptop") 
 public String saveLaptop(@ModelAttribute("Laptop") Laptop Laptop,  
     @RequestParam("date") String date, 
     ModelMap modelMap) throws ParseException  
 { 
  //conversion de la date  
       SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd"); 
        Date dateCreation = dateformat.parse(String.valueOf(date)); 
        Laptop.setDateCreation(dateCreation); 
       
  Laptop saveLaptop = laptopService.saveLaptop(Laptop); 
 String msg ="Laptop enregistré avec Id "+saveLaptop.getIdLaptop(); 
  modelMap.addAttribute("msg", msg); 
  return "createLaptop"; 
 } 
}
