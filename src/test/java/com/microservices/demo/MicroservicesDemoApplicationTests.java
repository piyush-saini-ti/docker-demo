package com.microservices.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
class MicroservicesDemoApplicationTests {

    private MockMvc mockMvc;

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectWriter writer = objectMapper.writer();

    List<User> users = new ArrayList<>(){{
        add(new User(101,"Piyush"));
        add(new User(104,"Ashish"));
        add(new User(90,"Pankaj"));
        add(new User(302,"Shubham"));
    }};


@Mock
private Data data;

@InjectMocks
private UserService service;

   @Before
    void setUp(){
       MockitoAnnotations.initMocks(this);
       this.mockMvc = MockMvcBuilders.standaloneSetup(service).build();
   }


}
