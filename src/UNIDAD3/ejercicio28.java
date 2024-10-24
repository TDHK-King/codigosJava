package UNIDAD3;


import static UNIDAD3.ejercicio19.imprimirMatriz;
import static UNIDAD3.ejercicio20.matrizAleatoria;


public class ejercicio28 {
    public static void main(String[] args) {

        int[][] matriz = matrizAleatoria(7,3,0,10);
        imprimirMatriz(matriz);
        System.out.println("el resultado es: ");
        imprimirMatriz(matrizTraspuesta(matriz));



    }
public static int[][] matrizTraspuesta(int[][] matriz){
        int [][] matrizResultante = new int[matriz[0].length][matriz.length];
        for (int i = 0;i < matriz.length;i++){


            for (int j = 0;j < matriz[i].length;j++){
                matrizResultante [j][i] = matriz [i][j];
            }


        }

        return matrizResultante;
}



}
