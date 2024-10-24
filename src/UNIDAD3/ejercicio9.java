package UNIDAD3;

import static UNIDAD3.ejercicio1.*;
import static UNIDAD3.funciones.imprimirVector.*;

public class ejercicio9 {
    public static void main(String[] args) {
    int[] vector = vectorAleatorio(10,0,10);
    imprimirV(vector);
    double resultadoSuma = 0 ;
    for (int i = 1;i < 10; i++){
        resultadoSuma = vector [0] += vector[i];

    }
        System.out.println(resultadoSuma);
        double promedio = resultadoSuma / 10;
        System.out.println(promedio);
    }


}
