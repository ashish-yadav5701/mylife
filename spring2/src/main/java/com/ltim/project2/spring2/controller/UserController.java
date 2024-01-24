package com.ltim.project2.spring2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ltim.project2.spring2.entity.User;
import com.ltim.project2.spring2.service.UserServiceImpl;
import com.ltim.project2.spring2.service.UserService;

import java.net.URI;
import java.rmi.server.ServerCloneException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController

public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/list")
    public List<User> getList() {
      return  service.findAll();
    }
    @GetMapping("/findUser/{id}")
    public User getUserByID(@PathVariable int id) {
        return service.findOne(id);
    }
    @PostMapping("/add/{user}")
    public ResponseEntity<> insert(@RequestBody User user) {
        //TODO: process POST request
       User saved= service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId()).toUri();
        return "inserted user";
    }
    
    
}
