package UNIDAD3;

import static UNIDAD3.funciones.imprimirVector.*;



///1) Entender la logica
///2) dividir el problema en subproblemas en papel
///3) resolver en pseudocodigo en papel
///4) llevar a codigo



public class E3MaxFischer {
    public static void main(String[] args) {
        imprimirV(vectorFibonacci(0));



    }
    public static int[] vectorFibonacci(int num){

        if (num < 0){
            throw new IllegalArgumentException("el numero no puede ser negativo");
        }
        int[] vectorResultante = new int[num];
        if (num == 0){
            return vectorResultante;

        }



        for (int i = 0; i < num;i++){
            vectorResultante[i] = fibonacci(i+1);
        }
        return vectorResultante;



    }



    public static int fibonacci(int num){
        //casos base
        if (num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }else {
            //caso recursivo
            return fibonacci(num - 1) + fibonacci(num - 2);
        }

    }










}