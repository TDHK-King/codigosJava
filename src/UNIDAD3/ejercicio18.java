package UNIDAD3;

import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        System.out.println("ingrese cantidad de filas y columnas: ");
        Scanner scanner = new Scanner(System.in);
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        int [][] matriz = new int[filas][columnas];

        System.out.println("ingrese los valores para la matriz: ");
        for (int i = 0;i < filas;i++){
            for (int j = 0;j < columnas;j++){
                System.out.printf("ingrese el valor para la posicion [%d][%d]: ", i, j);
                matriz [i][j] = scanner.nextInt();
            }
        }

        System.out.println("la matriz ingresada es: ");
        for (int i = 0;i < filas;i++){
            for (int j = 0;j < columnas;j++){
                System.out.println(matriz[i][j]);
            }
        }


    }
}
