package ejerciciosmixtos;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nummayor = 0;
        int a = 0;
        for (;a<10;a++) {
            System.out.println("ingrese numero a comparar: ");
            int num1 = scanner.nextInt();
            if (num1>nummayor){
                nummayor = num1;
            }

        }
        System.out.println("el numero mayor es: " + nummayor);

    }
}