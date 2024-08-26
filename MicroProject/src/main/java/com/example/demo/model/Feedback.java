package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedbacks")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int cleanliness;
    private String cleanlinessDescription;
    private int service;
    private String serviceDescription;
    private int amenities;
    private String amenitiesDescription;
    private int valueForMoney;
    private String valueForMoneyDescription;
    private String comments;
    private String recommend;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCleanliness() {
		return cleanliness;
	}
	public void setCleanliness(int cleanliness) {
		this.cleanliness = cleanliness;
	}
	public String getCleanlinessDescription() {
		return cleanlinessDescription;
	}
	public void setCleanlinessDescription(String cleanlinessDescription) {
		this.cleanlinessDescription = cleanlinessDescription;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	public int getAmenities() {
		return amenities;
	}
	public void setAmenities(int amenities) {
		this.amenities = amenities;
	}
	public String getAmenitiesDescription() {
		return amenitiesDescription;
	}
	public void setAmenitiesDescription(String amenitiesDescription) {
		this.amenitiesDescription = amenitiesDescription;
	}
	public int getValueForMoney() {
		return valueForMoney;
	}
	public void setValueForMoney(int valueForMoney) {
		this.valueForMoney = valueForMoney;
	}
	public String getValueForMoneyDescription() {
		return valueForMoneyDescription;
	}
	public void setValueForMoneyDescription(String valueForMoneyDescription) {
		this.valueForMoneyDescription = valueForMoneyDescription;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	public Feedback(Long id, String name, String email, int cleanliness, String cleanlinessDescription, int service,
			String serviceDescription, int amenities, String amenitiesDescription, int valueForMoney,
			String valueForMoneyDescription, String comments, String recommend) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cleanliness = cleanliness;
		this.cleanlinessDescription = cleanlinessDescription;
		this.service = service;
		this.serviceDescription = serviceDescription;
		this.amenities = amenities;
		this.amenitiesDescription = amenitiesDescription;
		this.valueForMoney = valueForMoney;
		this.valueForMoneyDescription = valueForMoneyDescription;
		this.comments = comments;
		this.recommend = recommend;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", email=" + email + ", cleanliness=" + cleanliness
				+ ", cleanlinessDescription=" + cleanlinessDescription + ", service=" + service
				+ ", serviceDescription=" + serviceDescription + ", amenities=" + amenities + ", amenitiesDescription="
				+ amenitiesDescription + ", valueForMoney=" + valueForMoney + ", valueForMoneyDescription="
				+ valueForMoneyDescription + ", comments=" + comments + ", recommend=" + recommend + "]";
	}
    
}
    