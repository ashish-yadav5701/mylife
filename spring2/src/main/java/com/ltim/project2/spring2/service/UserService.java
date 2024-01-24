package com.ltim.project2.spring2.service;

import java.util.List;

import com.ltim.project2.spring2.entity.User;

public interface UserService {
    public  List<User> findAll();
    public  User save(User user);
    public User findOne(int id);
    
}
