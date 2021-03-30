package com.trooper.forum.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private Long id;
    private String name;
    private String category;

    public Course(String name, String category) {
        this.name = name;
        this.category = category;
    }

}
