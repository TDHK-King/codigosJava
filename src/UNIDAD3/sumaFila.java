package UNIDAD3;

import static UNIDAD3.imprimirMatriz.imprimirMatriz;
import static UNIDAD3.matrizAleatoria.matrizAleatoria;

public class sumaFila {
    public static void main(String[] args) {
        int[][] matriz = matrizAleatoria(6,5,0,10);
        imprimirMatriz(matriz);
        System.out.println("el vector es: ");
        imprimirV(sumaFila(matriz));
    }

    public static int[] sumaFila(int [][] matriz){
        int[] vectorFila = new int[matriz.length];
        int [] resultado = new int[matriz.length];

        for (int i = 0;i < matriz.length;i++){
            int suma = 0;
            for (int j = 0; j < matriz[i].length;j++) {
                vectorFila[i] = matriz[i][j];
                suma = suma + vectorFila[i];


            }
            resultado [i] = suma;
        }
        return resultado;

    }




    public static void imprimirV(int[] vector) {
        for (int n = 0; n < vector.length; n++)
            System.out.println(vector[n]);


    }






}

