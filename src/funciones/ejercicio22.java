package funciones;
import java.util.Scanner;

import static programas.funciones.*;
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese 2 numeros que desee sumar: ");
        int resultado = sumar(scanner.nextInt(), scanner.nextInt());
        System.out.println("el resultado es: " + resultado);

    }
}
