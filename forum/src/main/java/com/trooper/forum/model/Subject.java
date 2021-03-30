package com.trooper.forum.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    private Long id;
    private String title;
    private String message;
    private LocalDateTime createdAt;
    private StatusSubject status = StatusSubject.NOT_RESPONDED;
    private User author;
    private Course course;
    private List<Responses> responses = new ArrayList<>();

    public Subject(String title, String message, Course course) {
        this.title = title;
        this.message = message;
        this.course = course;
    }

}
