package funciones;

import java.util.Scanner;

import static programas.funciones.*;

public class ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese numero binario a transformar: ");

        int resultado= debinarioadecimal(scanner.nextInt());
        System.out.println("el numero binario transformado a decimal seria: " + resultado);

    }
}
