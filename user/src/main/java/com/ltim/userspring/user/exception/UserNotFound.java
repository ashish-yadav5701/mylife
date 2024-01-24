package com.ltim.userspring.user.exception;

public class UserNotFound extends RuntimeException {
    public UserNotFound(String msg){
            super(msg);
    }
}
