package com.example.Laptops.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private Long idLaptop; 
	 private String brandLaptop; 
	 private Double prixLaptop;
	 private String caracteristiquesLaptop;
	 private Date dateCreation;
	 public Laptop() {
		super();
	 }
	 public Laptop(String brandLaptop, Double prixLaptop, String caracteristiquesLaptop, Date dateCreation) {
		super();
		this.brandLaptop = brandLaptop;
		this.prixLaptop = prixLaptop;
		this.caracteristiquesLaptop = caracteristiquesLaptop;
		this.dateCreation = dateCreation;
	 }
	 public Long getIdLaptop() {
		 return idLaptop;
	 }
	 public void setIdLaptop(Long idLaptop) {
		 this.idLaptop = idLaptop;
	 }
	 public String getBrandLaptop() {
		 return brandLaptop;
	 }
	 public void setBrandLaptop(String brandLaptop) {
		 this.brandLaptop = brandLaptop;
	 }
	 public Double getPrixLaptop() {
		 return prixLaptop;
	 }
	 public void setPrixLaptop(Double prixLaptop) {
		 this.prixLaptop = prixLaptop;
	 }
	 public String getCaracteristiquesLaptop() {
		 return caracteristiquesLaptop;
	 }
	 public void setCaracteristiquesLaptop(String caracteristiquesLaptop) {
		 this.caracteristiquesLaptop = caracteristiquesLaptop;
	 }
	 public Date getDateCreation() {
		 return dateCreation;
	 }
	 public void setDateCreation(Date dateCreation) {
		 this.dateCreation = dateCreation;
	 }
	 @Override
	 public String toString() {
		return "Laptop [idLaptop=" + idLaptop + ", brandLaptop=" + brandLaptop + ", prixLaptop=" + prixLaptop
				+ ", caracteristiquesLaptop=" + caracteristiquesLaptop + ", dateCreation=" + dateCreation + "]";
	 }
	 
	 
}
