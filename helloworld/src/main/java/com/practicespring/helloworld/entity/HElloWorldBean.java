package com.practicespring.helloworld.entity;

public class HElloWorldBean {
    private String message;
    public HElloWorldBean() {
    }
    public HElloWorldBean(String message){
        this.message=message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "HElloWorldBean [message=" + message + "]";
    }

    
    
}
