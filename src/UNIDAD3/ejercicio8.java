package UNIDAD3;

import static UNIDAD3.ejercicio1.*;
import static UNIDAD3.funciones.imprimirVector.*;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] resultado = vectorAleatorio(10, 7, 21);
        imprimirV(resultado);
        int numMayor = resultado[0];
        for (int i = 0;i < 10;i++){
            if (numMayor < resultado [i]) {
                numMayor = resultado [i];
            }
        }
        System.out.println(numMayor);
        }
}
