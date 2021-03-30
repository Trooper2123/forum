package com.trooper.forum.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Long id;
    private String name;
    private String emailAddress;
    private String password;

}
