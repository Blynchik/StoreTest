package com.store.exceptionHandler;

import com.store.exception.ItemNotFoundException;
import com.store.exception.response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    private ResponseEntity<ExceptionResponse> handleException(ItemNotFoundException e){

        ExceptionResponse response = new ExceptionResponse(e.getMessage(), LocalDateTime.now());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    private ResponseEntity<ExceptionResponse> handleException(HttpMessageNotReadableException e){

        ExceptionResponse response = new ExceptionResponse("Should be as one from available enumeration", LocalDateTime.now());

        return  new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
