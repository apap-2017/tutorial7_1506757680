package com.example.tutorial07consumer.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tutorial07consumer.model.StudentModel;
@Service
public interface StudentDAO {
	StudentModel selectStudent (String npm);
	List<StudentModel> selectAllStudents();

}
