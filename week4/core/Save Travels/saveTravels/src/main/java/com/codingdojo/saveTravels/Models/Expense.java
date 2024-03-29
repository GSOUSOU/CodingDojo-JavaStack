package com.codingdojo.saveTravels.Models;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="expenses")
public class Expense {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull
	@Size(min=5, max=200, message="Expense name must not be null")
	 private String name;
	 
	 
	 @NotNull
	 @Size(min = 5, max = 200, message="Vendor must not be null" )
	 private String vendor;
	 
	 @NotNull
	 @Min(value=0, message="Amount must be greater than zero")
		private Double amount;
	 
	 @NotBlank
	 @Size(min = 5, max = 200, message="Description must not be blank")
	 private String description;
	 
	 public Expense() {
		 
	 }
     public Expense(String name,String vendor,Double amount,String description) {
    	 this.name=name;
    	 this.vendor=vendor;
    	 this.amount=amount;
    	 this.description=description;
		 
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
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
     

}
