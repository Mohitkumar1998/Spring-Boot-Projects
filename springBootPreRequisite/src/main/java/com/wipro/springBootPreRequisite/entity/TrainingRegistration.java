package com.wipro.springBootPreRequisite.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainingRegistration")
public class TrainingRegistration {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="user_id")
	private long userId;
	@Column(name="trainingId")
	private long trainingId;
	@Column(name="trainingName")
	private String trainingName;
	@Column(name="location")
	private String location;
	@Column(name="userName")
	private String userName;
	@Column(name="userEmail")
	private String userEmail;
	@Column(name="dateOfRegistration")
	private Date dateOfRegistration;
	
	public TrainingRegistration() {
	}

	public TrainingRegistration(long id, long userId, long trainingId, String trainingName, String location,
			String userName, String userEmail, Date dateOfRegistration) {
		this.id = id;
		this.userId = userId;
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.location = location;
		this.userName = userName;
		this.userEmail = userEmail;
		this.dateOfRegistration = dateOfRegistration;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	
}
