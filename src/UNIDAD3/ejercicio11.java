package UNIDAD3;

import static UNIDAD3.vectorAleatorio.*;
import static UNIDAD3.funciones.imprimirVector.*;


public class ejercicio11 {
    public static void main(String[] args) {
        int[] vector1 = vectorAleatorio(10,0,10);
        System.out.println("el vector uno es: ");
        imprimirV(vector1);
        int[] vector2 = vectorAleatorio(10,0,10);
        System.out.println("el vector dos es: ");
        imprimirV(vector2);
        int[] resultado = new int[10];
        System.out.println("la suma 1 por una es:");
        for (int i = 0; i < 10; i++){
            resultado[i] = vector1[i] + vector2[i];
            System.out.println(resultado[i]);
        }



    }
}
