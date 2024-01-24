package com.ltim.project2.spring2.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ltim.project2.spring2.entity.User;

@Service
public class UserServiceImpl implements UserService {
    private static List<User> userList=new ArrayList<>();
    public static int idCount=5;
    static{
        userList.add(new User(1, "abc", new Date()));
        userList.add(new User(3, "jigar", new Date()));
        userList.add(new User(2, "pratik", new Date()));
        userList.add(new User(11, "ashish", new Date()));
    }
    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return  userList;
        //throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        if(user.getId()==null){
            user.setId(++idCount);
        }
        userList.add(user);
        return user;
        
    }

    @Override
    public User findOne(int id) {
        // TODO Auto-generated method stub
        User found=null;
       for(User u:userList){
        if(u.getId()==id){
            return u;
        }
       }
       if(found==null){
        try {
            throw new Exception("user not found with id::"+id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       }
       return null;
       
    }
    
}
