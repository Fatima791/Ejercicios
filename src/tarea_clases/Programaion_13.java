package tarea_clases;
import java.util.Scanner;
public class Programaion_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}