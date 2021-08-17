package com.example.Payroll;

class EmployeeNotFoundExceptipon extends RuntimeException {
    public EmployeeNotFoundExceptipon(Long id) {
        super("Employee with id " + id + " not found");
    }
}
