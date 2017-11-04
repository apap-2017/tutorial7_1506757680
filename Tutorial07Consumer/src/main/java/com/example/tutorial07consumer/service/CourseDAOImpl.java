package com.example.tutorial07consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.tutorial07consumer.dao.CourseDAO;
import com.example.tutorial07consumer.model.CourseModel;

public class CourseDAOImpl implements CourseDAO {
	@Autowired
	private RestTemplate restTemplate;
	 
	@Override
	public CourseModel selectCourse(String id) {
		CourseModel course = restTemplate.getForObject(
				"http://localhost:8080/rest/course/view/"+id, CourseModel.class);
		return course;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseModel> selectAllCourses() {
		List<CourseModel> courses = 
				restTemplate.getForObject("http://localhost://8080/rest/course/viewall/", List.class);
		return courses;
	}

}
