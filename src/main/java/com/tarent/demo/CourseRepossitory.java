package com.tarent.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepossitory extends CrudRepository<Course, UUID>{
	
	//List<Course> findByCourseDescription(String mCourseDescription);
	Optional<Course> findById(UUID id);
}
