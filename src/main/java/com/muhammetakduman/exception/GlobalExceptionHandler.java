package com.muhammetakduman.exception;


import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {
    //spring validation 'dan fırlatılan hataları yönetmek , cevap vermek.

    private List<String> addMapValue (List<String > list , String newValue){
        list.add(newValue);
        return list;
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public void handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        for (ObjectError objectError; ex.getBindingResult().getAllErrors()) {

            
        }
    }
}
