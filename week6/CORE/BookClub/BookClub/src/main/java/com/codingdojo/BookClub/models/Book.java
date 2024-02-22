package com.codingdojo.BookClub.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="title must be not blank")
    @Size(min = 5, max = 255,message="title must be at least 10 characters.")
    private String title;
    @NotBlank(message="auther must be not blank")
    @Size(min = 5, max = 255)
    private String author;
    @NotBlank(message="throughts must be not blank")
    @Size(min = 10, max = 255,message="throughts must be at least 10 characters.")
    private String throughts;
   
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    //------M:1--------
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private  User postedby;
 
    public Book() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getThroughts() {
		return throughts;
	}

	public void setThroughts(String throughts) {
		this.throughts = throughts;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public User getPostedby() {
		return postedby;
	}
	public void setPostedby(User postedby) {
		this.postedby = postedby;
	}

	
    
    // other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
	
	
}

