package UNIDAD3;

import  static UNIDAD3.funciones.imprimirVector.*;


public class ejercicio15 {
    public static void main(String[] args) {
        int[] vector = new int[5];
        int[] vector1 = new int[5];

        int j = 5;

        for (int i = 0;i < vector.length;i++){
            vector[i] = i;
            vector1[i] = j++;
        }
        System.out.println("vector 1:");
        imprimirV(vector);
        System.out.println("vector 2:");
        imprimirV(vector1);
        System.out.println("imprimir vector 3:");
        imprimirV(vectorOrdenadoMayorAMenor(vector,vector));
    }



    public static int [] vectorOrdenadoMayorAMenor(int[] vector1, int[] vector2){
        int[] vectorResultante = new int[vector1.length + vector2.length];
        for (int i = 0;i< vectorResultante.length;i++){
        if (vector1[i]<vector2[i]){
            vectorResultante[i] = vector1[i];
            vectorResultante [i + 1] =vector2[i];
        }else{
            vectorResultante[i] = vector2[i];
            vectorResultante[i] = vector1[i];
        }
        }return vectorResultante;





    }




}
