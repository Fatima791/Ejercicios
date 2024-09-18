package tarea_clases;

import java.util.Scanner;
public class Programa_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("MAYOR DE EDAD");
        } else {
            System.out.println("NO ES MAYOR DE EDAD");
        }
    }
    }