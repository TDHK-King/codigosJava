package UNIDAD3;

import java.util.Random;
public class ejercicio1 {
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







