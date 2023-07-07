package com.empresa.empleados.Utils;

import com.empresa.empleados.entities.Employee;
import com.empresa.empleados.repositories.EmployeeRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataInit implements ApplicationRunner {

    private final EmployeeRepository employeeRepository;
    public DataInit(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void run(ApplicationArguments args) {
        Employee employee1 = new Employee("Juan", "1023903", "3432435", 23);
        Employee employee2 = new Employee("Pedro", "6345345", "234234234", 54);
        Employee employee3 = new Employee("Miguel", "098123", "72234234", 19);
        Employee employee4 = new Employee("Andrés", "4572304", "3454546", 45);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4);
        employeeRepository.saveAll(employees);
    }
}