package com.tarent.demo;

public class CourseNotFoundException extends RuntimeException{
	public CourseNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
		super("Cannot find the course "+ id);
	}
}
