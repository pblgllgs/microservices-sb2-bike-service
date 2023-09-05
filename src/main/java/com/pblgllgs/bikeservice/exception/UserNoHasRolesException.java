package com.pblgllgs.bikeservice.exception;

public class UserNoHasRolesException extends RuntimeException{
    public UserNoHasRolesException(String message) {
        super(message);
    }
}
