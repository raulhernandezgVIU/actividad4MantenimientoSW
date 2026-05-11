package com.example.hr;

//Clase de la validación de contraseñas en ORANGEHRM
public class PasswordValidator {
    //Comprueba la robustez de la contraseña
    public boolean isStrong(String password) {
        if (password == null) return false;
        boolean longitud = password.length() >= 8;
        boolean mayuscula = password.matches(".*[A-Z].*");
        boolean minuscula = password.matches(".*[a-z].*");
        boolean numero = password.matches(".*[0-9].*");
        boolean simbolo = password.matches(".*[!@#$%^&*().,;:_+-].*");
        return longitud && mayuscula && minuscula && numero && simbolo;
    }
    //Contraseñas prohibidas que el usuario no debe de poner
    public boolean containsForbiddenWords(String password) {
        if (password == null) return false;
        String[] forbidden = {"admin", "password", "1234", "qwerty"};
        for (String f : forbidden) {
            if (password.toLowerCase().contains(f)) {
                return true;
            }
        }
        return false;
    }
    //Comprobación de validez
    public boolean isValid(String password) {
        return isStrong(password) && !containsForbiddenWords(password);
    }
}
