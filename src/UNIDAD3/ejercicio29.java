package UNIDAD3;

import static UNIDAD3.ejercicio19.imprimirMatriz;
import static UNIDAD3.ejercicio20.matrizAleatoria;

public class ejercicio29 {
    public static void main(String[] args) {
    int[][] matriz1 = matrizAleatoria(3,2,0,10);
    int[][] matriz2 = matrizAleatoria(2,3,0,10);
        imprimirMatriz(matriz1);
        System.out.println("la segunda matriz es: ");
        imprimirMatriz(matriz2);
        System.out.println("el resultado es: ");
        imprimirMatriz(productoDeMatrices(matriz1,matriz2));

    }


    public static int[][] productoDeMatrices(int[][] matriz1,int[][] matriz2){
        int[][] matrizresultante = new int[matriz1[0].length][matriz2.length];
        for (int i = 0;i < matrizresultante.length;i++){
            for (int j = 0;j < matrizresultante[i].length;j++){



            }


        }





    return matrizresultante;
    }


}
