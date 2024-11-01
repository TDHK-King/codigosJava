package UNIDAD3;

import static UNIDAD3.imprimirMatriz.*;
import static UNIDAD3.matrizAleatoria.*;
import static UNIDAD3.tareas.ejercicio26opcion2.*;
import static UNIDAD3.vectorOrdenadoMenorAMayor.*;
import static UNIDAD3.busquedaEntero.*;

public class EjercicioPracticaJueves1 {
    //vector
    public static void main(String[] args) {
    int[][] matriz = matrizAleatoria(4,4,0,10);
        imprimirMatriz(matriz);
        System.out.println("y el vector resultante es: ");
        imprimirV(mayorSumaColumna(matriz));



    }
    public static int [] mayorSumaColumna(int[][] matriz){
        int [] vectorColumnaMayor = new int[matriz.length];

        vectorColumnaMayor = sumaColumna(matriz);

        int [] vectorAux = vectorColumnaMayor.clone();

        int dim = vectorAux.length - 1;
        selectionSort(vectorAux);
        int columna = busquedaEntero(vectorColumnaMayor,vectorAux[dim]);



        for (int i = 0;i < vectorColumnaMayor.length;i++){
            vectorColumnaMayor[i] = matriz[i][columna];

        }




        return vectorColumnaMayor;
    }












}
