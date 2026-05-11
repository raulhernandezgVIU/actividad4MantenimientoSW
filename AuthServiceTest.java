package com.example.hr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Clase para los test de autenticacion de servicio
class AuthServiceTest {
    //Test 1 - Login Correcto
    @Test
    void loginCorrectoConCredencialesValidas() {
        AuthService authService = new AuthService();
        boolean resultadoTest1 = authService.login("Admin", "admin123");
        //Assert
        assertTrue(resultadoTest1, "El login válido con credenciales correctas, pruebas validadas");
    }
    //Test 2 - Login Incorrecto
    @Test
   void loginConCredencialesInvalidas() {
        AuthService authService = new AuthService();
        boolean resultadoTest2 = authService.login("Admin", "adminator53");
        //Assert
        assertFalse(resultadoTest2, "El login falla con contraseña incorrecta.");
    }
    //Test 3 - Reseteo de la contraseña
    @Test
    void resetPasswordCorrecto() {
        AuthService authService = new AuthService();
        boolean resultadoTest3 = authService.resetPassword("Admin");
        //Assert
        assertTrue(resultadoTest3, "El reset de contraseña funciona para un usuario existente");
    }
    //Test 4 - Reset de contraseña no funciona
    @Test
    void resetPasswordFallido() {
        AuthService authService = new AuthService();
        boolean resultado = authService.resetPassword("UsuaryRandom");
        // Assert
        assertFalse(resultado, "El reset de contraseña no funciona");
    }
}