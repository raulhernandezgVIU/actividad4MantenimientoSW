package com.example.hr;

import java.util.List;

//Clase Employee con ejemplos de clase para poder realizar test
public class EmployeeService {
    private final List<String> employees = List.of("Charles", "Paul", "Anna");
    //Para poder obtener todos los empleados
    public List<String> getAllEmployees() {
        return employees;
    }
    //Para poder filtrar por nombre del empleado
    public boolean existsByName(String name) {
        if (name == null) return false;
        return employees.stream().anyMatch(e -> e.equalsIgnoreCase(name));
    }
}