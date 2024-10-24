package EntradaYSalidaEstandar;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre y presione enter: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su altura en metros y presione enter: ");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese su edad y presione enter: ");
        int edad = scanner.nextInt();

        System.out.println("mi nombre es " + nombre + ", mido " + altura + " metros y tengo " + edad + " años" );


    }

}
