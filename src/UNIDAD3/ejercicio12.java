package UNIDAD3;


import static UNIDAD3.funciones.imprimirVector.*;
import static UNIDAD3.ejercicio1.*;

public class ejercicio12 {

    public static int busquedaEntero(int[] vector, int entero){
        for (int i = 0;i < vector.length;i++){

            if (entero == vector[i]){
                return i;
            }
        }

    return -1;
    }


}
