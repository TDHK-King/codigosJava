package repeticionsimple;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a promediar: ");
        int N = scanner.nextInt();
        System.out.println("ingrese su primer numero: ");
        double num1 = scanner.nextDouble();
        int a = 1;
        while  (a<N) {
            a++;
            System.out.println("ingrese el numero: ");
            num1 = num1 + scanner.nextInt();


        }
        double promedio = num1/N;
        System.out.println("el promedio es: " + promedio);
    }
}
