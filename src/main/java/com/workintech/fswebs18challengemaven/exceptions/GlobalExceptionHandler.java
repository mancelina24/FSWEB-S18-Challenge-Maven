package com.workintech.fswebs18challengemaven.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CardException.class)
    public ResponseEntity<CardErrorResponse> handleException(CardException ex)
    {
        CardErrorResponse error = new CardErrorResponse(ex.getHttpStatus().value(), ex.getMessage(),
                System.currentTimeMillis());
        return new ResponseEntity<>(error, ex.getHttpStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CardErrorResponse> handleException(Exception ex)
    {
        CardErrorResponse error = new CardErrorResponse(ex.getMessage());
        return new ResponseEntity<CardErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
