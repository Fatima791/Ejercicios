package tarea_clases;
 import java.util.Scanner;
public class Programaion_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine().toLowerCase();
        
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        
        System.out.println("El número de vocales en la cadena es: " + vocales);
    }
}