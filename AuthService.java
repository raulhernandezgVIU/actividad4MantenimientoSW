package com.example.hr;

//Clase para hacer las pruebas de autenticacion en la pagina de inicio en ORANGEHRM
public class AuthService {
    //Funcion de login
    public boolean login(String username, String password) {
        if (username == null || password == null) return false;
        return username.equals("Admin") && password.equals("admin123");
    }
    //Funcion de reseteo de contraseña
    public boolean resetPassword(String username) {
        if (username == null || username.isBlank()) return false;
        //Simulamos que solo existe el usuario "Admin" en la BBDD
        return username.equals("Admin");
    }
}