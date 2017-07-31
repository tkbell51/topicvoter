package com.tbell.topicvoter.controllers;

import com.tbell.topicvoter.Repositories.TopicRepositoryImpl;
import com.tbell.topicvoter.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TopicController {

    @Autowired
    private TopicRepositoryImpl repo;

    @RequestMapping("/")
    public String index(Model model){
        List<Topic> allTopics = repo.findAll();
        model.addAttribute("topics",allTopics);
        return "index";
    }
}
