package tarea_clases;
 import java.util.Scanner;

public class Programaion_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE; // Empezamos con el valor más pequeño posible
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
    }
}

