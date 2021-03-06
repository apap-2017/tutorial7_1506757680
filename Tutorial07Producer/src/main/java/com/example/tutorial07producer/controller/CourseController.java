package com.example.tutorial07producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.tutorial07producer.model.CourseModel;
import com.example.tutorial07producer.service.CourseService;
@Controller
public class CourseController {
	@Autowired
	CourseService courseDAO;
	
    @RequestMapping("/course/view/{id}")
    public String selectCourse (Model model,
            @PathVariable(value = "id") String id)
    {
        CourseModel course = courseDAO.selectCourse(id);

        if (course != null) {
            model.addAttribute ("course", course);
            return "viewcourses";
        } else {
            model.addAttribute ("id", id);
            return "nocourse";
        }
    }
    
    @RequestMapping("/course/viewall")
    public String selectAllCourse(Model model) {
    	List<CourseModel> courses = courseDAO.selectAllCourse();
    	
    	model.addAttribute("courses", courses);
    	return "viewall-courses";
    }
}
