package com.wipro.springBootPreRequisite.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainingdetails")
public class TrainingDetails {
	@Id
	@Column(name="training_id")
	private long trainingId;
	@Column(name="training_name")
	private String trainingName;
	@Column(name="start_date")
	private String startDate;
	@Column(name="end_ate")
	private String endDate;
	@Column(name="training_stat")
	private String trainingStat;
	@Column(name="location")
	private String location;
	@Column(name="business_unit")
	private String businessUnit;
	@Column(name="contact_person_id")
	private String contactPersonId;
	public TrainingDetails(long trainingId, String trainingName, String startDate, String endDate, String trainingMode,
			String location, String businessUnit, String contactPersonId) {
		this.trainingId = trainingId;
		this.trainingName = trainingName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainingStat = trainingMode;
		this.location = location;
		this.businessUnit = businessUnit;
		this.contactPersonId = contactPersonId;
	}
	public TrainingDetails() {
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getTrainingMode() {
		return trainingStat;
	}
	public void setTrainingStat(String trainingStat) {
		this.trainingStat = trainingStat;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getContactPersonId() {
		return contactPersonId;
	}
	public void setContactPersonId(String contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
}
