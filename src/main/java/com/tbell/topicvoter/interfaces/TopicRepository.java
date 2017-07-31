package com.tbell.topicvoter.interfaces;

import com.tbell.topicvoter.models.Topic;

import java.util.List;

public interface TopicRepository {
    List<Topic> findAll();
}
