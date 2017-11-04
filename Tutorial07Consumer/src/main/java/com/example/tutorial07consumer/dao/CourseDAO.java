package com.example.tutorial07consumer.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tutorial07consumer.model.CourseModel;
@Service
public interface CourseDAO {
	CourseModel selectCourse(String id);
	List<CourseModel> selectAllCourses();
}
