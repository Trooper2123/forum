package com.trooper.forum.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Responses {

    private Long id;
    private String message;
    private Subject subject;
    private LocalDateTime createdAt;
    private Boolean resolved = false;
}
