package tarea_clases;

import java.util.Scanner;

public class Programa_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        
        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El número mayor es: " + mayor);
    }
}