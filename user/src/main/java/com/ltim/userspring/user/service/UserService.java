package com.ltim.userspring.user.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.ltim.userspring.user.entity.User;
public interface UserService {
    public  List<User> findAll();
    public  User save(User user);
    public User findOne(int id);
    public User deleteById(int id);
}
