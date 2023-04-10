package com.microservices.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Data {

    List<User> users = new ArrayList<>(){{
        add(new User(101,"Piyush"));
        add(new User(104,"Ashish"));
        add(new User(90,"Pankaj"));
        add(new User(302,"Shubham"));
    }};

    public List<User> getAllUsers(){
        return users;
    }

}
