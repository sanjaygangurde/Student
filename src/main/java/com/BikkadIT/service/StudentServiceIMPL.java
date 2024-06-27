package com.BikkadIT.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.Student;
import com.BikkadIT.repository.StudentRepository;

@Service
public class StudentServiceIMPL implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean addStudent(Student stu) {
		Student save = studentRepository.save(stu);
		if (save != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public String saveAllStudent(List<Student> liststu) {
		List<Student> saveAll = studentRepository.saveAll(liststu);
		if (saveAll != null) {
			return "All Student Saved Succsefully ";
		} else {
			return "All Student not Saved Succsefully ";
		}
	}

	@Override
	public Student getStuByID(int sid) {
		Student findById = studentRepository.findById(sid).get();
		return findById;
	}

	@Override
	public Student getStuByIDReqParam(int sid) {
		Student student = studentRepository.findById(sid).get();
		return student;
	}

	@Override
	public boolean updateStudent(Student stu) {
		Student save = studentRepository.save(stu);
		if (save != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String updateAllStudent(List<Student> list) {
		List<Student> saveAll = studentRepository.saveAll(list);
		if (saveAll != null) {
			return "All Student Updated Succesfully";
		} else {
			return "All Student Not Updated Succesfully";
		}

	}

	@Override
	public boolean deleteRecordById(int sid) {
		boolean existsById = studentRepository.existsById(sid);
		if (existsById) {
			studentRepository.deleteById(sid);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteAllRecord() {
		List<Student> findAll = studentRepository.findAll();
		if (findAll.isEmpty()) {
			return false;
		} else {
			studentRepository.deleteAll();
			return true;
		}
	}

}
