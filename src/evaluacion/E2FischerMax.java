package evaluacion;

import java.util.Scanner;

public class E2FischerMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros de los cuales desee calcular el minimo comun multiplo: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultado = minimoComunMultiplo(num1, num2);
        System.out.println("el minimo comun multiplo es: " + resultado);
    }


    public static int minimoComunMultiplo(int a, int b) {
        int i = Math.max(a,b);
        while   (!(i % a == 0 &&  i % b == 0)){
            i++;
        }
        return  i;






    }
}
