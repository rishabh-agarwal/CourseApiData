package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
//get all course by name - specific method naming structure
   public List<Course> findByName(String name);
   public List<Course> findByDescription(String description); //or foo
   
 // get all topic by topic id  
   public List<Course> findByTopicId(String name);
}
