/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.logicadeprogramacion;

import java.util.Scanner;

/**
 *calcule el estado de la temperatura
que pueda ingresar por consola el usuario el momento del dia(manana tarde o noche)
y que pueda ingresar la temperatura de acuerdo al dia(manana tarde noche)
y que calcule si es norma intermedio o peligroso
 * @author khenv
 */
public class Clase_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in); 

    String[] momentoDia = {"mañana", "tarde", "noche"};
    //String[] temperatura = {"buena", "Normal", "Peligrosa"};
    
    System.out.println("Ingrese el momento del día (mañana, tarde, noche): ");
    String momento = scanner.nextLine();

        System.out.println("Ingrese la temperatura numérica: ");
        int grados = scanner.nextInt();

        String categoria;
        if (grados <= 29) {
            categoria = "buena";
        } else if (grados >= 30 && grados <= 35) {
            categoria = "Normal";
        } else {
            categoria = "Peligrosa";
        }
        
        System.out.println("Durante la "+momento +" la temperatura fue de "+grados+" grados, por lo que el estado de la temperatura fue "+categoria);


    }
    
}
