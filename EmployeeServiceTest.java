package com.example.hr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Clase de los test de la clase EmployeeService
class EmployeeServiceTest {
    //Test 5 - Buscar el empleado por el nombre
    @Test
    void existsByNameEmployee() {
        EmployeeService employeeService = new EmployeeService();
        boolean existeBuscado = employeeService.existsByName("Charles");
        //Assert
        assertTrue(existeBuscado, "Debería encontrar al empleado Charles en la lista");
    }
    //Test 6 - COmprobacion de tamaño de lista de empleados
    @Test
    void getAllEmployeesDebeDevolverTresEmpleados() {
        EmployeeService service = new EmployeeService();
        int total = service.getAllEmployees().size();
        assertEquals(3, total, "El sistema debería devolver exactamente 3 empleados y es correcto");
    }
}