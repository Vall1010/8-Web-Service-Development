package com.montrealcollege.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montrealcollege.rest.model.Course;

@RestController
@RequestMapping("/course")
public class RESTController {
	
	@GetMapping(path="/create/{name}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Course showCourse(@PathVariable String name) {
		return new Course(name, 0);
	}
	
	@GetMapping(path="/createXML/{name}", produces = MediaType.APPLICATION_XML_VALUE)
	public Course showCourseXML(@PathVariable String name) {
		return new Course(name, 0);
	}
	
	@GetMapping(path="/createJSON/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Course> showCourseJSON(@PathVariable String name) {
		Course course = new Course(name, 0);
		return new ResponseEntity<Course>(course, HttpStatus.OK) ;
	}
	
	@PostMapping(path="/create", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Course> showCourse(@RequestBody Course course) {	
		course.setName(course.getName()+" - MCIT");
		return new ResponseEntity<Course>(course, HttpStatus.CREATED);
	}

}
