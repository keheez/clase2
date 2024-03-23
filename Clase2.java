/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logicadeprogramacion;

/**
 *
 * @author khenv
 */

import java.util.Scanner;

public class Clase2 {
       public static void main(String[] args) {
           
Scanner scanner = new Scanner(System.in);        // crear un objeto scanner para poder ingresar datos

        int sumaMayores = 0;
        int cantidadMayores = 0;
        int sumaMenores = 0;
        int cantidadMenores = 0;

        int[] edades = new int[5];

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Ingrese la edad: ");
            edades[i] = scanner.nextInt();
        }

        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                sumaMayores += edades[i];
                cantidadMayores++;
            } else {
                sumaMenores += edades[i];
                cantidadMenores++;
            }
        }

        double promedioMayores = (double) sumaMayores / cantidadMayores;
        double promedioMenores = (double) sumaMenores / cantidadMenores;

        System.out.println("La cantidad de Mayores es: " + cantidadMayores);
        System.out.println("El promedio de edad de los Mayores es: " + promedioMayores);
        System.out.println("La cantidad de Menores es: " + cantidadMenores);
        System.out.println("El promedio de edad de los Menores es: " + promedioMenores);
    }
}

   