package com.nosin.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not Find the user with id "+id);
    }
}
