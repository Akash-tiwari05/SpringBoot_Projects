package com.example.RailwayAndMeal.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TicketBodyInvalidException extends RuntimeException{
    //complete the method body for TicketBodyInvalidException constructor

    public TicketBodyInvalidException(String message) {
        super(message);
    }
}
