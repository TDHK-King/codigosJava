package UNIDAD3.tareas;

import static UNIDAD3.ejercicio1.*;
import static UNIDAD3.funciones.imprimirVector.*;

public class funcionSubVector {
    public static void main(String[] args) {
        /////diseñar una funcion "subVector" que reciba como argumento un vector y dos valores correspondientes a indices.La funcion debe devolver un nuevo vector con los elementos desde el primer hasta el segundo indice inclusive.
        int[] pepe = vectorAleatorio(10,0,15);
        int[] horacio = subVector(pepe,4,9);
        imprimirV(horacio);
        System.out.println("vector");
        imprimirV(pepe);
    }
    public static int[]subVector(int[]vector,int elemento,int elemento2){
        int a = 0;
        int[] vectorResultante = new int[elemento2 - elemento + 1];
        for (int i = elemento;i <= elemento2; i++){
            vectorResultante[a++] = vector[i];

        }
        return vectorResultante;
    }
}
