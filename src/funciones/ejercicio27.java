package funciones;

import java.util.Scanner;

import static programas.funciones.*;

public class ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero a verificar si es par: ");
        boolean espar = esPer(scanner.nextInt());
        System.out.println("el resultado es: " + espar);




    }
}
