package ejerciciosmixtos;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero a comparar: ");
        int nummenor = scanner.nextInt();
        int a = 0;
        for (;a<14;a++) {
            System.out.println("ingrese numero a comparar: ");
            int num1 = scanner.nextInt();
            if (num1<nummenor){
                nummenor = num1;
            }

        }
        System.out.println("el numero menor es: " + nummenor);
    }
}
