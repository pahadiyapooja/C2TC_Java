package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.Student;

public interface IStudentService {

	public Student addStudent(Student student);   
	public Student updateStudent(Student student);   
	public Student searchStudentById(int id);         
	public Student searchStudentByHallTicket(int ticketNo); 
	public Student deleteStudent(Student student);    

	public Student addCertificate(Student student);  
	public Student updateCertificate(Student student);
	
}
