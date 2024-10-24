package UNIDAD3;

import java.util.Random;
import static UNIDAD3.ejercicio19.*;
public class ejercicio20 {
    public static void main(String[] args) {
        int[][] matrizResultante = matrizAleatoria(3,3,0,10);
        imprimirMatriz(matrizResultante);




    }
    public static int [][] matrizAleatoria(int filas,int columnas,int min,int max){
        int [][] matriz = new int[filas][columnas];
        for (int i = 0;i < filas;i++){
            for (int j = 0;j < columnas;j++){
                matriz [i][j] =   enteroaleatorio(min, max);
            }
        }
        return matriz;


    }
    public static int enteroaleatorio(int min, int max){
        Random random =new Random();
        return random.nextInt((max - min) + 1 )+ min;


    }



}
