package UNIDAD3;

import static UNIDAD3.imprimirMatriz.*;
import static UNIDAD3.matrizAleatoria.*;

public class obtenerColumna {
    public static void main(String[] args) {
        int[][] matriz = matrizAleatoria(6,5,0,10);
        imprimirMatriz(matriz);
        System.out.println("la columna es : ");
        imprimirV(obtenerColumna(matriz,2));


    }

    public static int[] obtenerColumna(int [][] matriz,int columna){
        int[] vectorColumna = new int[matriz.length];

        for (int i = 0;i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++) {

                if (j == columna) {
                    vectorColumna[i] = matriz[i][j];
                }
            }

        }
        return vectorColumna;

    }




        public static void imprimirV(int[] vector) {
            for (int n = 0; n < vector.length; n++)
                System.out.println(vector[n]);


        }





}
