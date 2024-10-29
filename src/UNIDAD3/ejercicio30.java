package UNIDAD3;

import java.util.Scanner;
import static UNIDAD3.ejercicio19.*;

public class ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese la dimension de la matriz: ");
        int numero = scanner.nextInt();
        imprimirMatriz(matrizCuadradaDiagonal(numero));
    }
    public static int[][] matrizCuadradaDiagonal(int numero){
        int[][] matriz = new int[numero][numero];
        int x = matriz.length;
        for (int i = 0; i < matriz.length;i++){
            int numero1 = x + 1;
            for (int j = 0; j < matriz.length;j++){
                numero1 = numero1 - 1;
                matriz [i][j] = numero1;


            }
            x += 1;
        }




        return matriz;
    }






}
