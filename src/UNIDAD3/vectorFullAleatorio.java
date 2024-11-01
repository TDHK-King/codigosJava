package UNIDAD3;

import java.util.Random;


public class vectorFullAleatorio {

    public static int[] vectorFullAleatorio(int dimension,int min,int max){
        int [] vector = vectorAleatorio(dimension, min, max);
        for (int i = 0;i < vector.length;i++){
            int entero = enteroaleatorio(min, max);
            vector[i] = entero;
            if (i>0) {
                while (busquedaEntero(vector, entero) != -1) {
                    entero = enteroaleatorio(min, max);
                }vector [i] = entero;
            }
        }

        return vector;
    }




    public static int busquedaEntero(int[] vector, int entero){
        for (int i = 0;i < vector.length;i++){

            if (entero == vector[i]){
                return i;
            }
        }

        return -1;
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



