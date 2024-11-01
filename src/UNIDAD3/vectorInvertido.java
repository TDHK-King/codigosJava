package UNIDAD3;

import static UNIDAD3.funciones.imprimirVector.*;

import java.util.Random;

public class vectorInvertido {
    public static void main(String[] args) {
        int[] vector = vectorAleatorio(5,0,10);
        imprimirV(vector);
        System.out.println("vector invertido:");
        imprimirV(vectorInvertido(vector));
    }


    public static int[] vectorInvertido(int[] vector){
        for (int i = 0;i < vector.length/2;i++){
            int dimension = vector.length -1;
            int resta = dimension - i;
            int auxiliar = vector [i];
            vector [i] = vector[resta];
            vector [resta] = auxiliar;
        }
        return vector;


    }














    public static int[] vectorAleatorio(int dimension, int min, int max) {
        int[] vector = new int[dimension];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = enteroaleatorio(min, max);

        }
        return vector;





    }
    public static int enteroaleatorio(int min, int max){
        Random random =new Random();
        return random.nextInt((max - min) + 1 )+ min;


    }
}
