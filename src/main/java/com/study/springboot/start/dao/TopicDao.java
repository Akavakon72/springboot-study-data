package com.study.springboot.start.dao;

import org.springframework.data.repository.CrudRepository;

import com.study.springboot.start.bean.Topic;

//crudrepository class which operation is on and 2nd is type of id
public interface TopicDao extends CrudRepository<Topic, String> {

	
	//getAllTopic
	//getTopic(String id)
	//updateTopic
	//deleteTopic(String id)
}
