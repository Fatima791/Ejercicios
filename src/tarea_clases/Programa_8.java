
package tarea_clases;
    import java.util.Scanner;

public class Programa_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es positivo.");
        }
    }
}


