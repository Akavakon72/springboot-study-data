package com.study.springboot.start.service;

import java.util.ArrayList;
/*import java.util.Arrays;*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.start.bean.Course;
import com.study.springboot.start.dao.CourseDao;


@Service
public class CourseService {
	
		@Autowired
		private CourseDao courseDao;
		
	/*
	 * private List<Topic> topics = new ArrayList<> (Arrays.asList( new
	 * Topic("Spring","SpringFramework","Springframework topic"), new
	 * Topic("Java","Core Java","Java topic"), new
	 * Topic("JavaScript","JavaScript Framework","JavaScript topic") ));
	 */
		
		public List<Course> getAllCourses(String topicId){
			List<Course> courses = new ArrayList<>();
			courseDao.findByTopicId(topicId)
			.forEach(courses::add);
			return courses;
			//return topics;
		}
		
		public Course getCourse(String id) {
			return (Course) courseDao.findById(id).get();
			//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}
		
		public void addCourse(Course course) {
			courseDao.save(course);
			//topics.add(topic);
		}

		public void updateCourse(String id, Course course) {
		/*
		 * for(int i = 0; i < topics.size(); i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i, topic); return; } }
		 */
			courseDao.save(course);
			
		}

		public void deleteCourse(String id) {
		/*
		 * for(int i = 0; i < topics.size(); i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.remove(i); return; } }
		 */
			//topics.removeIf(t -> t.getId().equals(id));
			courseDao.deleteById(id);
		}
}
