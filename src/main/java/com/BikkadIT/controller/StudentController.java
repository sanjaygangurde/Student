package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Student;
import com.BikkadIT.service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;

	@PostMapping(value = "/addstudent", consumes = "application/json")
	public ResponseEntity<String> addStudent(@RequestBody Student stu) {
		boolean addStudent = studentServiceI.addStudent(stu);
		if (addStudent) {
			return new ResponseEntity<String>("Save Student Succesfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Student Not saved Succesfully", HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = "/getAllStudent", produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudent() {

		List<Student> allStudent = studentServiceI.getAllStudent();
		return new ResponseEntity<List<Student>>(allStudent, HttpStatus.OK);

	}

	@PostMapping(value = "/saveAllStudent", consumes = "application/json")
	public ResponseEntity<String> saveAllStudent(@RequestBody List<Student> liststu) {
		String saveAllStudent = studentServiceI.saveAllStudent(liststu);
		return new ResponseEntity<String>(saveAllStudent, HttpStatus.CREATED);

	}

	@GetMapping(value = "/getStuByID/{sid}", produces = "application/json")
	public ResponseEntity<Student> getStuByID(@PathVariable int sid) {
		Student stuByID = studentServiceI.getStuByID(sid);
		return new ResponseEntity<Student>(stuByID, HttpStatus.OK);

	}

	@GetMapping(value = "/getStuByIDReqParam", produces = "application/json")
	public ResponseEntity<Student> getStuByIDReqParam(@RequestParam int sid) {
		Student stuByIDReqParam = studentServiceI.getStuByIDReqParam(sid);
		return new ResponseEntity<Student>(stuByIDReqParam, HttpStatus.OK);

	}

	@PutMapping(value = "/updateStudent", consumes = "application/json")
	public ResponseEntity<String> updateStudent(@RequestBody Student stu) {
		boolean updateStudent = studentServiceI.updateStudent(stu);
		if (updateStudent) {
			return new ResponseEntity<String>("Student Updated Succsefully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Student Not Updated Succsefully", HttpStatus.OK);
		}

	}

	@PutMapping(value = "/updateAllStudent", consumes = "application/json")
	public ResponseEntity<String> updateAllStudent(@RequestBody List<Student> list) {
		String updateAllStudent = studentServiceI.updateAllStudent(list);
		return new ResponseEntity<String>(updateAllStudent, HttpStatus.CREATED);

	}
	
	@DeleteMapping(value = "/deleteRecordById")
	public ResponseEntity<String> deleteRecordById(@RequestParam int sid) {
		boolean deleteRecordById = studentServiceI.deleteRecordById(sid);
		if(deleteRecordById) {
			return new ResponseEntity<String>("Record deleted succesfully",HttpStatus.OK);
		}else {
		
		return new ResponseEntity<String>("Record not deleted succesfully",HttpStatus.BAD_REQUEST);
		}	
	}
	
	@DeleteMapping(value = "/deleteAllRecord")
	public ResponseEntity<String> deleteAllRecord(){
		boolean deleteAllRecord = studentServiceI.deleteAllRecord();
		if(deleteAllRecord) {
			return new ResponseEntity<String>("All record deleted succesfully", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("All record not deleted succesfully", HttpStatus.OK);
		}
		
		
	}

}
