package com.trooper.forum.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Responses {

    private Long id;
    private String message;
    private Subject subject;
    private LocalDateTime createdAt;
    private Boolean resolved = false;
}
