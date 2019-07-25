package com.study.springboot.start.service;

import java.util.ArrayList;
/*import java.util.Arrays;*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.start.bean.Topic;
import com.study.springboot.start.dao.TopicDao;


@Service
public class TopicService {
	
		@Autowired
		private TopicDao topicDao;
		
	/*
	 * private List<Topic> topics = new ArrayList<> (Arrays.asList( new
	 * Topic("Spring","SpringFramework","Springframework topic"), new
	 * Topic("Java","Core Java","Java topic"), new
	 * Topic("JavaScript","JavaScript Framework","JavaScript topic") ));
	 */
		
		public List<Topic> getAllTopics(){
			List<Topic> topics = new ArrayList<>();
			topicDao.findAll().forEach(topics::add);
			return topics;
			//return topics;
		}
		
		public Topic getTopic(String id) {
			return (Topic) topicDao.findById(id).get();
			//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		}
		
		public void addTopic(Topic topic) {
			topicDao.save(topic);
			//topics.add(topic);
		}

		public void updateTopic(Topic topic, String id) {
		/*
		 * for(int i = 0; i < topics.size(); i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i, topic); return; } }
		 */
			topicDao.save(topic);
			
		}

		public void deleteTopic(String id) {
		/*
		 * for(int i = 0; i < topics.size(); i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.remove(i); return; } }
		 */
			//topics.removeIf(t -> t.getId().equals(id));
			topicDao.deleteById(id);
		}
}
