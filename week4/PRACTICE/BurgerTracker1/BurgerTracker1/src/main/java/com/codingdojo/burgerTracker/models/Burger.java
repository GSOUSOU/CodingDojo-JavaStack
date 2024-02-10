package com.codingdojo.burgerTracker.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="burgers")
public class Burger {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull
	@Size(min=1, max=200, message="Burger name must not be null")
	 private String name;
	 
	 @NotNull
	 @Size(min = 5, max = 100, message="restaurant name must not be null" )
	 private String restaurantName;
	 
	 @NotNull
	 @Min(1)
	 @Max(5)
	 private int rating ;
	 
	 @NotBlank
	 @Size(min = 5, max = 200, message="Notes must not be empty")
	 private String notes;
	 public Burger() {
		 
	 }
 public Burger(String name,String restaurantName,int rating,String notes) {
		 
	 }
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRestaurantName() {
	return restaurantName;
}
public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}

public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String getNotes() {
	return notes;
}
public void setNotes(String notes) {
	this.notes = notes;
}

}
