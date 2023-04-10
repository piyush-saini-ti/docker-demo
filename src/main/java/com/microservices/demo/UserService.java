package com.microservices.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    @Autowired
    private Data data;

    public List<User> getUsersSorted(){
        return data.getAllUsers().stream().sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
    }

}
