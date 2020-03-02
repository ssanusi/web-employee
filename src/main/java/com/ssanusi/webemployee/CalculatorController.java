package com.ssanusi.webemployee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping(value = "/calc/salary/{empID}/{raise}", produces = {"application/json"})
    public ResponseEntity<?> checkRaise(@PathVariable long empID, @PathVariable double raise) {
        Employee employee = new Employee(WebEmployeeApplication.ourEmpList.findEmployee(e -> (e.getId() == empID)));

        employee.setSalary(employee.getSalary() * (1.0 + raise));

        return new ResponseEntity<>(employee, HttpStatus.OK);

    }
}
