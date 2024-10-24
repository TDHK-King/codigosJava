package UNIDAD3;

import java.util.Scanner;

import static UNIDAD3.ejercicio19.*;


public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrizResultante = identidad(scanner.nextInt());
        imprimirMatriz(matrizResultante);


    }
    public static  int [][] identidad(int n){
        int[][] matriz = new int[n][n];
        for (int i = 0;i < matriz.length;i++){
            for (int j = 0;j < matriz[i].length;j++){
                if (i == j){
                    matriz[i][j] = 1;
                }else matriz[i][j] = 0;
            }
        }
        return matriz;





    }




}
