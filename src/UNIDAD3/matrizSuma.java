package UNIDAD3;

import static UNIDAD3.imprimirMatriz.*;
import static UNIDAD3.matrizAleatoria.*;

public class matrizSuma {
    public static void main(String[] args) {
        int[][] matriz1 = matrizAleatoria(5,5,-5,10);
        System.out.println("matriz1: ");
        imprimirMatriz(matriz1);
        int[][] matriz2 = matrizAleatoria(5,5,-5,10);
        System.out.println("matriz 2 : ");
        imprimirMatriz(matriz2);
        System.out.println("matriz resultante: ");
        imprimirMatriz(matrizSuma(matriz1,matriz2));


    }
    public static int[][] matrizSuma(int[][] matriz ,int [][] matriz2){
        for (int i = 0;i < matriz.length;i++){
            for (int j = 0;j < matriz[i].length;j++){
                matriz [i][j] =   matriz [i][j] + matriz2[i][j];
            }
        }
        return matriz;



    }






}
