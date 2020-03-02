package com.ssanusi.webemployee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
// Beans - POJO managed by Spring
@RequestMapping("/data")
public class EmployeeController {

    @GetMapping(value = "/allemployees", produces = {"application/json"})
    public ResponseEntity<?> getAllEmployees() {
        WebEmployeeApplication.ourEmpList.empList.sort((e1, e2) -> e1.getFirstName().compareToIgnoreCase(e2.getFirstName()));
        return new ResponseEntity<>(WebEmployeeApplication.ourEmpList.empList, HttpStatus.OK);

    }

    @GetMapping(value = "/employee/{empID}", produces = {"application/json"})
    public ResponseEntity<?> getEmployeeById(@PathVariable long empID) {
        return new ResponseEntity<>(WebEmployeeApplication.ourEmpList.findEmployee(e -> (e.getId() == empID)), HttpStatus.OK);
    }

    @GetMapping(value = "/employees/{letter}", produces = {"application/json"})
    public ResponseEntity<?> employeeByFirstName(@PathVariable char letter) {
        ArrayList<Employee> employeesList = WebEmployeeApplication.ourEmpList.findEmployees(e -> e.getLastName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        return new ResponseEntity<>(employeesList, HttpStatus.OK);
    }

}
