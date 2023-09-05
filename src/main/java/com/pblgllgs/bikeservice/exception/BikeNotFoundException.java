package com.pblgllgs.bikeservice.exception;

public class BikeNotFoundException extends RuntimeException{
    public BikeNotFoundException(String message) {
        super(message);
    }
}
