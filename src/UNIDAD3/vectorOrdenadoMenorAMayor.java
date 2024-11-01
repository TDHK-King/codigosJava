package UNIDAD3;

import  static UNIDAD3.funciones.imprimirVector.*;


public class vectorOrdenadoMenorAMayor {
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
        imprimirV(vectorOrdenadoMenorAMayor(vector,vector1));
    }



    public static int [] vectorOrdenadoMenorAMayor(int[] vector1, int[] vector2){
        int[] vectorResultante = new int[vector1.length + vector2.length];
        int l = vector1.length;
        for (int i = 0;i < vector1.length;i++){
            vectorResultante[i] = vector1 [i];
        }
        for (int i = 0;i < vector2.length;i++){
            vectorResultante[l] = vector2[i];
            l++;
        }

        selectionSort(vectorResultante);


        return vectorResultante;




    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento mínimo en la sublista no ordenada
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Intercambiar el elemento mínimo encontrado con el primer elemento
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }



}
