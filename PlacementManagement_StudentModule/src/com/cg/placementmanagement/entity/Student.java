package com.cg.placementmanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {

	private static final long serialVersionUID=1L;
	@Id
	private int id;
	private String name;
	private String college;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	private String certificate;
	private int hallTicketNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public int getHallTicketNo() {
		return hallTicketNo;
	}
	public void setHallTicketNo(int hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
