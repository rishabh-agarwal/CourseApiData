package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{
	
	  //all predifine crud operation
}
