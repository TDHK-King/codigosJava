package UNIDAD3;

import java.util.Scanner;
public class matrizAEleccion {
    public static void main(String[] args) {
    }

        public static int[][] matrizAEleccion(int filas,int columnas){
            Scanner scanner = new Scanner(System.in);
            int[][] matriz = new int[filas][columnas];

            System.out.println("ingrese los valores para la matriz: ");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.printf("ingrese el valor para la posicion [%d][%d]: ", i, j);
                    matriz[i][j] = scanner.nextInt();
                }
            }

        return matriz;
        }

}