package UNIDAD3;

import static  UNIDAD3.ejercicio1.vectorAleatorio;
import static UNIDAD3.funciones.imprimirVector.*;

public class ejercicio10 {
    public static void main(String[] args) {
        int[] vector = vectorAleatorio(10,0,10);
        imprimirV(vector);
        System.out.println("los numeros pares son: ");
        for (int i = 0;i < 10;i++){
            if (vector[i] % 2 == 0){
                System.out.println(vector[i]);
            }


        }





    }
}
