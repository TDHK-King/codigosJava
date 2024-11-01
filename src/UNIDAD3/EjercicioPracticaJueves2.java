package UNIDAD3;

import java.util.Scanner;

import static UNIDAD3.vectorFullAleatorio.*;
import static UNIDAD3.funciones.imprimirVector.*;

public class EjercicioPracticaJueves2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[] vector = vectorFullAleatorio(7,0,10);
        imprimirV(vector);
        imprimirV(twoSum(vector, scanner.nextInt()));





    }


    public static int[] twoSum(int[] vector,int numero){
        int resultado = 0;
        int[] indices = new int[2];

        for (int i = 0;i < vector.length;i++){
            for (int j = 0; j < vector.length;j++){
                if (i != j) {
                    resultado = vector[i] + vector[j];


                }
                if (resultado == numero){
                    indices [0] = i;
                    indices [1] = j;

                    return indices;
                }


            }
        }




    return  indices;



    }








}
