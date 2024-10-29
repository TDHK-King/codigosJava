package UNIDAD3;

import static UNIDAD3.ejercicio18.*;
import static UNIDAD3.ejercicio19.*;
import static UNIDAD3.ejercicio26.*;

public class ejercicioProfe {
    public static void main(String[] args) {
        int [][] matriz = matrizAEleccion(1,3);
        imprimirMatriz(matriz);
        System.out.println("la matriz es diagonal dominante : " + diagonalDominante(matriz));


    }
    public static boolean diagonalDominante (int [][] matriz){
        if (matriz.length != matriz[0].length) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada");
        }
        boolean boleano = true;
        for (int i = 0 ; i < matriz.length;i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = Math.abs(matriz[i][j]);
            }
        }
        int[] suma = sumaFila(matriz);

        for (int i = 0; i < matriz.length;i++){
            if (matriz[i][i] < suma[i] - matriz[i][i]){
                return false;
            }
        }
        return boleano;
    }







}
