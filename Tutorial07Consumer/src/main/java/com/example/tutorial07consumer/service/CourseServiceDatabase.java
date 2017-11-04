package com.example.tutorial07consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutorial07consumer.dao.CourseMapper;
import com.example.tutorial07consumer.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService{
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public CourseModel selectCourse(String id) {
		log.info ("select course with id_course {}", id);
        return courseMapper.selectCourse(id);
	}

	@Override
	public List<CourseModel> selectAllCourse() {
		return courseMapper.selectAllCourse();
	}

}
