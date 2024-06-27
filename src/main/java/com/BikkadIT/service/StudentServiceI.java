package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.model.Student;



public interface StudentServiceI {
	
	public boolean addStudent(Student stu);
	
	public List<Student> getAllStudent();
	
	public String saveAllStudent(List<Student> liststu);

	public Student getStuByID(int sid);
	
	public Student getStuByIDReqParam(int sid);
	
	public boolean updateStudent(Student stu);
	
	public String updateAllStudent(List<Student> list);
	
	public boolean deleteRecordById(int sid);
	
	public boolean deleteAllRecord();
}
