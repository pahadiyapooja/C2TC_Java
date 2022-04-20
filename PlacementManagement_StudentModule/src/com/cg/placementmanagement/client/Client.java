package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entity.Student;
import com.cg.placementmanagement.service.IStudentService;
import com.cg.placementmanagement.service.IStudentServiceImpl;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		IStudentService service = new IStudentServiceImpl();
		
		//Create
//	    student.setId(5);
//		student.setName("Mayuri");
//		student.setCollege("Devegiri");
//		student.setRoll(2);
//		student.setQualification("MCA");
//		student.setCourse("Computer_Application");
//	    student.setYear(2022);
//		student.setCertificate("Post_Graduate");
//		student.setHallTicketNo(1234);
//		service.addStudent(student);
//		System.out.println("Data is added successfully");

	  //Retrieve
//		student=service.searchStudentById(5);
//		System.out.println(student.getName());
//		System.out.println(student.getCollege());
//		System.out.println(student.getRoll());
//		System.out.println(student.getQualification());
//		System.out.println(student.getCourse());
//		System.out.println(student.getYear());
//		System.out.println(student.getCertificate());
//		System.out.println(student.getHallTicketNo());
		
		// Update
//		
		student=service.searchStudentById(5);
		student.setName("jay");
		student.setCollege("azad_clg");
		student.setRoll(11);
		student.setQualification("MBA");
		student.setCourse("ABC");
		student.setYear(2002);
		student.setCertificate("BDS");
		student.setHallTicketNo(989);
		service.updateStudent(student);
		System.out.println("Update is successfully");
		
		//Delete
//		student=service.searchStudentById(30);
//		service.deleteStudent(student);
//		System.out.println("Delete is successfully");
		
		
		
		
	}

}
