package com.trooper.forum.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Subject {
    private Long id;
    private String title;
    private String message;
    private LocalDateTime createdAt;
    private StatusSubject status = StatusSubject.NOT_RESPONDED;
    private User author;
    private Course course;
    private List<Responses> responses = new ArrayList<>();

}
