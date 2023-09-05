package ru.skypro.lessons.springboot.spring3.controler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundExeption extends RuntimeException{

    private static final String DEFAULT_MESSAGE = "Employee not found";

    public EmployeeNotFoundExeption() {
        super(DEFAULT_MESSAGE);
    }
}