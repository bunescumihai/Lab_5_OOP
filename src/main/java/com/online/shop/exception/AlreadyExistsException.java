package com.online.shop.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;


public class AlreadyExistsException extends RuntimeException{
    private String message;

    public AlreadyExistsException(String message){
        super(message);
        this.message = message;
    }
}
