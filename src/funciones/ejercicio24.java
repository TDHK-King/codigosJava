package funciones;
import java.util.Scanner;

import static programas.funciones.*;
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba primero una base y luego un exponente para su elevacion: ");
        double resultado = potencia(scanner.nextDouble(), scanner.nextInt());
        System.out.println("el resultado es: " + resultado);
    }


}
