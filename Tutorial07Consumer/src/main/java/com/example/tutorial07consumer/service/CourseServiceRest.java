package com.example.tutorial07consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.tutorial07consumer.dao.CourseDAO;
import com.example.tutorial07consumer.model.CourseModel;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
@Primary
public class CourseServiceRest implements CourseService{
	@Autowired
	private CourseDAO courseDAO;
	
	@Override
	public CourseModel selectCourse(String id) {
		log.info("select course with id {}", id);
		return courseDAO.selectCourse(id);
	}

	@Override
	public List<CourseModel> selectAllCourse() {
		return courseDAO.selectAllCourses();
	}

}
