package funciones;

import java.util.Scanner;

import static programas.funciones.*;

public class ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese dos numeros a comparar: ");
        int resultado = max(scanner.nextInt(), scanner.nextInt());
        System.out.println("el numero mayor es: " + resultado);


    }


}
