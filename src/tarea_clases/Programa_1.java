package tarea_clases;

import java.util.Scanner;

public class Programa_1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Mostrar los números ingresados
        System.out.println("El primer número es: " + num1);
        System.out.println("El segundo número es: " + num2);
    }
}

    