package UNIDAD3.tareas;

import static UNIDAD3.imprimirMatriz.imprimirMatriz;
import static UNIDAD3.matrizAleatoria.matrizAleatoria;

public class ejercicio26opcion2 {
    public static void main(String[] args) {
        int[][] matriz = matrizAleatoria(6,5,0,10);
        imprimirMatriz(matriz);
        System.out.println("el vector es: ");
        imprimirV(sumaColumna(matriz));
    }

    public static int[] sumaColumna(int [][] matriz){
        int[] resultado = new int[matriz[0].length];
        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < matriz[0].length; j++){
                resultado [i] += matriz[j][i];
            }
        }


        return resultado;

    }




    public static void imprimirV(int[] vector) {
        for (int n = 0; n < vector.length; n++)
            System.out.println(vector[n]);


    }
}
