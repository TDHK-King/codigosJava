package UNIDAD3.tareas;

import static UNIDAD3.ejercicio1.*;
import static UNIDAD3.funciones.imprimirVector.*;

public class funcionEsta { /////// diseñar una funcion esta() que determine si un valor esta en un vector si es el caso devolver true y false en el contrario
    public static void main(String[] args) {
        int [] pepe = vectorAleatorio(10,0,9);
        boolean doctor = esta(pepe,0);
        imprimirV(pepe);
        System.out.println(doctor);

    }

        public static boolean esta (int[]vector, int numero){
            for(int i :vector){
                if (numero == vector[i]){
                     return true;
                }
            }
            return false;
        }




    }
