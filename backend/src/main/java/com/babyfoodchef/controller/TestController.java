package com.babyfoodchef.controller;


import com.babyfoodchef.dto.User;
import com.babyfoodchef.dto.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/users")
public class TestController {

    @GetMapping
    public Test<?> getUsers(){
        Test<List<User>> resp = new Test<>();
        List<User> list = new ArrayList<>();
        list.add(new User("테스트", "1"));
        list.add(new User("테스트2", "2"));
        list.add(new User("테스트3", "3"));
        resp.setResponse(list);
        return resp;
    }
    @GetMapping("/{id}")
    public Test<?> getUser(@PathVariable int id){
        Test<User> resp = new Test<>();
        List<User> list = new ArrayList<>();
        list.add(new User("테스트", "1"));
        list.add(new User("테스트2", "2"));
        list.add(new User("테스트3", "3"));
        resp.setResponse(list.get(id));
        return resp;
    }
}