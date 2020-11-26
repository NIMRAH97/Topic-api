package com.practise.courseapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    //blah blah
    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {
        List<Topic> topics = topicRepository.findAll();
        return topics;
//        return topicRepository.findAll();
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
