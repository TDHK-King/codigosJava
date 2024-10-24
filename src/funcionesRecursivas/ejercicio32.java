package funcionesRecursivas;

import java.util.Scanner;

public class ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero del que quiera calcular el factorial: ");

        int numero = scanner.nextInt();
        int resultado = factorial(numero);
        System.out.println("el resultado es: " + resultado);
    }
    public static int factorial(int n){
        //caso base
        if (n <= 1){
            return 1;
        }
        else {
            //caso recursivo
            return n*factorial(n-1);
        }
    }



}
