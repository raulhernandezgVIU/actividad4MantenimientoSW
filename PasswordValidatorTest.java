package com.example.hr;

//Clase para los test de validador de contraseñas
public class PasswordValidator {
    //Test 7 - Password debil por falta de simbolos
    @Test
    void passwordDebil() {
        PasswordValidator validator = new PasswordValidator();
        boolean resultado = validator.isStrong("Orb374");
        //Assert
        assertFalse(resultado, "La contraseña debería ser débil");
    }
    //Test 8 - Password cumple con todos los requisitos
    @Test
    void passwordDebeSerFuerteConTodosLosRequisitos() {
        PasswordValidator validator = new PasswordValidator();
        boolean resultado = validator.isStrong("Ayst384*");
        //Assert
        assertTrue(resultado, "La contraseña fuerte, cumple todos los requisitos");
    }
}