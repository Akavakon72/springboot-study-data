package com.study.springboot.start.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.study.springboot.start.bean.Course;

//crudrepository class which operation is on and 2nd is type of id
public interface CourseDao extends CrudRepository<Course, String> {

	//start with find By Name 
	//no need to create to find data by property 
	//findByName // findByDescription
	//getAllTopic
	//getTopic(String id)
	//updateTopic
	//deleteTopic(String id)
	//findByTopicId
	public List<Course> findByTopicId(String topicId);
}
