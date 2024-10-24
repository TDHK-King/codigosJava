package UNIDAD3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la tabla que desee: ");
        int[] tabla = new int[10];
        int num = scanner.nextInt();
        for (int i = 0 ; i < 10 ; i++){
            tabla [i] = num * (i + 1)  ;
        }
        imprimirV(tabla);


    }

    public static void imprimirV(int[] vector) {
        for (int n = 0; n < vector.length; n++)
            System.out.println(vector[n]);


    }



}
// crear una tabla para el numero 4 que se guarde en un vector y luego se imprima