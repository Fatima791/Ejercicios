
package tarea_clases;
import java.util.Scanner;

public class Programaion_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();
        
        double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }
        
        double promedio = suma / cantidad;
        System.out.println("El promedio es: " + promedio);
    }
}
