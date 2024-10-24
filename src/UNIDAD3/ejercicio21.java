package UNIDAD3;

import static UNIDAD3.ejercicio20.*;
import static UNIDAD3.ejercicio19.*;

public class ejercicio21 {
    public static void main(String[] args) {
    int[][] matriz1 = matrizAleatoria(3,3,10,20);
    imprimirMatriz(matriz1);
    int [][] matrizresultante = matrizEscalar(matriz1,10);
        System.out.println("la matriz final seria: ");
        imprimirMatriz(matrizresultante);



    }
    public static int[][] matrizEscalar(int[][] matriz ,int escalar){
        for (int i = 0;i < matriz.length;i++){
            for (int j = 0;j < matriz[i].length;j++){
                matriz [i][j] =   matriz [i][j] * escalar;
            }
        }
        return matriz;



    }


}
