package UNIDAD3;

import static UNIDAD3.imprimirMatriz.imprimirMatriz;
import static UNIDAD3.matrizAleatoria.matrizAleatoria;

public class obtenerFila {
    public static void main(String[] args) {
        int[][] matriz = matrizAleatoria(6,5,0,10);
        imprimirMatriz(matriz);
        System.out.println("el vector es:");
        imprimirV(obtenerFila(matriz,2));


    }

    public static int[] obtenerFila(int [][] matriz,int fila){
        int[] vectorFila = new int[matriz[0].length];

        for (int i = 0;i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length;j++) {

                if (i == fila) {
                    vectorFila [j] = matriz[i][j];
                }
            }

        }
        return vectorFila;

    }




    public static void imprimirV(int[] vector) {
        for (int n = 0; n < vector.length; n++)
            System.out.println(vector[n]);


    }





}
