package com.myapp.shareit.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RentalNotFoundException extends RuntimeException {
    public RentalNotFoundException() {
    }

    public RentalNotFoundException(String message) {
        super(message);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
