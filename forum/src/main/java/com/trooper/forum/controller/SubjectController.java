package com.trooper.forum.controller;

import com.trooper.forum.model.Course;
import com.trooper.forum.model.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class SubjectController {

    @RequestMapping("/subject")
    @ResponseBody
    public List<Subject> subjectsList(){
        Subject subject = new Subject("Dúvida","Dúvida com Spring",new Course("Spring","Programação"));
        return Arrays.asList(subject,subject,subject);
    }
}
