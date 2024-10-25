package UNIDAD3;

import java.io.IOException;

import static UNIDAD3.ejercicio19.imprimirMatriz;
import static UNIDAD3.ejercicio20.matrizAleatoria;

public class ejercicio29 {
    public static void main(String[] args) {
    int[][] matriz1 = matrizAleatoria(3,2,0,10);
    int[][] matriz2 = matrizAleatoria(3,4,0,10);
        imprimirMatriz(matriz1);
        System.out.println("la segunda matriz es: ");
        imprimirMatriz(matriz2);
        System.out.println("el resultado es: ");
        imprimirMatriz(productoDeMatrices(matriz1,matriz2));

    }


    public static int[][] productoDeMatrices(int[][] matriz1,int[][] matriz2){
        if (matriz1[0].length != matriz2.length){
            throw new IllegalArgumentException("las filas de la primer matriz deben tener el mismo valor que las columnas de la 2da");
        }
        int[][] matrizResultante = new int[matriz1.length][matriz2[0].length];

        for (int i = 0;i < matriz1.length;i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                int suma = 0;
                for (int k = 0; k < matriz1[0].length; k++) {
                    suma += Math.abs(matriz1[i][k]) * Math.abs(matriz2[k][j]);

                }
                matrizResultante[i][j] = suma;
            }
        }





        return matrizResultante;
    }


}
