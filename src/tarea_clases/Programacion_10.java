
package tarea_clases;
 import java.util.Scanner;
public class Programacion_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        
        int mediano = num1;
        
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            mediano = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            mediano = num2;
        } else {
            mediano = num3;
        }
        
        System.out.println("El número mediano es: " + mediano);
    }
}

    
