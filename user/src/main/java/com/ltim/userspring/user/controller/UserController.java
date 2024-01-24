package com.ltim.userspring.user.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ltim.userspring.user.service.UserService;
import com.ltim.userspring.user.entity.User;
import com.ltim.userspring.user.exception.UserNotFound;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping()
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
    public ResponseEntity<String> insert(@RequestBody User user) {
        //TODO: process POST request
       User saved= service.save(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saved.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<User> delete(@PathVariable int id) throws UserNotFound {
        User u= service.deleteById(id);
       
         
            if(u!=null){
                return new ResponseEntity<>(u,HttpStatus.OK);
            }
            else{
                throw new UserNotFound("No such use::"+id+" found ");
            }
      
    }
    @ExceptionHandler(UserNotFound.class)
    public  ResponseEntity<String> handleUserNotFound(UserNotFound e){
           return new ResponseEntity<String>("not found ", HttpStatus.NOT_FOUND);
    }

    
}
