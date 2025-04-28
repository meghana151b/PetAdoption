package com.pet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String type;
	private String breed;
	private int age;
	private String description;
	private String imageUrl;
	private boolean adopted= false;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(Long id, String name, String type, String breed, int age, String description, String imageUrl,
			boolean adopted) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.breed = breed;
		this.age = age;
		this.description = description;
		this.imageUrl = imageUrl;
		this.adopted = adopted;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public boolean isAdopted() {
		return adopted;
	}
	public void setAdopted(boolean adopted) {
		this.adopted = adopted;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", type=" + type + ", breed=" + breed + ", age=" + age
				+ ", description=" + description + ", imageUrl=" + imageUrl + ", adopted=" + adopted + "]";
	}
	
	

}
