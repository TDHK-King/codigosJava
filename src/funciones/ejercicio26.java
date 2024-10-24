package funciones;

import java.util.Scanner;

import static programas.funciones.*;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el radio de su circulo: ");
        double Area = areacirculo(scanner.nextDouble());
        System.out.println("el area de su circulo es igual a: " + Area);


    }
}
