package com.Inheritance.bean;

import com.Inheritance.app.Person;

public class Patient extends Person{

	int patientNumber;
	String hospital;
	int yearOfJoining;
	String address;
	int fees;
	public Patient(int patientNumber, String hospital, int yearOfJoining,
			String address, int fees) {
		super();
		this.patientNumber = patientNumber;
		this.hospital = hospital;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
		this.fees = fees;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
