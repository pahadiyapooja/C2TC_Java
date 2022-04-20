package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entity.Student;

public interface IStudentRepository {
	public Student addStudent(Student student);    
	public Student updateStudent(Student student);   
	public Student searchStudentById(int id);         
	public Student searchStudentByHallTicket(int ticketNo);  
	public Student deleteStudent(Student student);    

	public Student addCertificate(Student student);  
	public Student updateCertificate(Student student);  

	public abstract void commitTranscation();
	public abstract void beginTransaction();
}
