package UNIDAD3;

import static UNIDAD3.ejercicio19.imprimirMatriz;
import static UNIDAD3.ejercicio20.matrizAleatoria;

public class ejercicio27 {
    public static void main(String[] args) {
        int[][] matriz = matrizAleatoria(5,6,10,20);
        imprimirMatriz(matriz);
        System.out.println("la suma es: ");
        System.out.println(sumaDiagonal(matriz));






    }
    public static int sumaDiagonal (int [][] matriz){
        int suma = 0;
        int dim = matriz.length;
        if (dim != matriz[0].length){
            return -1;
        }
        for (int i = 0; i < matriz.length;i++){

                    suma += matriz [i][i];
        }
      return suma;
    }





}
