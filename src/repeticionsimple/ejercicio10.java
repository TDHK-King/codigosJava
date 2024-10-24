package repeticionsimple;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        System.out.println("ingrese el primer numero a promediar: ");
        double num1 = scanner.nextDouble() ;
        while (a<7){
        a++;
        System.out.println("ingrese el siguiente numero a promediar");
        num1 = num1 + scanner.nextDouble();
        }
        double promedio = num1/7 ;
        System.out.println("el promedio es: " + promedio);


    }






}
