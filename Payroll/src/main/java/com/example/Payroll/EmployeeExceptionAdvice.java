package com.example.Payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
class EmployeeExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(EmployeeNotFoundExceptipon.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundExceptipon e) {
        return e.getMessage();
    }
}
