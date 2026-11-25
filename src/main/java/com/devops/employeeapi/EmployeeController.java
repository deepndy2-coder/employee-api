package com.devops.employeeapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(1L, "Aarav Sharma", "DevOps Engineer"),
                new Employee(2L, "Meera Singh", "Java Developer"),
                new Employee(3L, "Kabir Verma", "QA Engineer")
        );
    }
}
