package condicionales;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero a comparar con 10: ");
        int num1 = scanner.nextInt();
        if (num1>10){
            System.out.println("el numero ingresado es superior a 10");

        } else if (num1<10) {
            System.out.println("el numero ingresado es inferior a 10");
        }else {
            System.out.println("el numero ingresado es igual a 10");
        }
        System.out.println("pepe");
    }
}
