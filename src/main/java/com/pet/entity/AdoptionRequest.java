package com.pet.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AdoptionRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String userName;
	private String contactInfo;
	
	@ManyToOne
	private Pet pet;
	private LocalDate requestDate =LocalDate.now();
	public AdoptionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdoptionRequest(Long id, String userName, String contactInfo, Pet pet, LocalDate requestDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.contactInfo = contactInfo;
		this.pet = pet;
		this.requestDate = requestDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	@Override
	public String toString() {
		return "AdoptionRequest [id=" + id + ", userName=" + userName + ", contactInfo=" + contactInfo + ", pet=" + pet
				+ ", requestDate=" + requestDate + "]";
	}

	
	
}
