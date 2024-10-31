package UNIDAD3;
import static UNIDAD3.ejercicio1.*;
import static UNIDAD3.funciones.imprimirVector.*;

public class ejerciciosPractica {
    public static void main(String[] args) {
        int[] vector = vectorAleatorio(5,0,10);
        imprimirV(vector);
        System.out.println("y el resultado es: ");
        imprimirV(circularShift(vector,4));
    }

        public static int[] circularShift(int[] vector, int desplazamiento) {
            desplazamiento = desplazamiento % vector.length;
            int[] vectorResultante = new int[vector.length];


            for (int i = 0; i < vector.length; i++) {
                int nuevaPosicion = (i + desplazamiento) % vector.length;
                vectorResultante[nuevaPosicion] = vector[i];
            }

            return vectorResultante;
        }
    }
    /////0 % 5 = 0   // 0 ÷ 5 = 0, resto 0
//1 % 5 = 1   // 1 ÷ 5 = 0, resto 1
//2 % 5 = 2   // 2 ÷ 5 = 0, resto 2
//3 % 5 = 3   // 3 ÷ 5 = 0, resto 3
//4 % 5 = 4   // 4 ÷ 5 = 0, resto 4
//5 % 5 = 0   // 5 ÷ 5 = 1, resto 0  ¡Aquí vuelve a empezar!
//6 % 5 = 1   // 6 ÷ 5 = 1, resto 1
//7 % 5 = 2   // 7 ÷ 5 = 1, resto 2
//8 % 5 = 3   // 8 ÷ 5 = 1, resto 3
//9 % 5 = 4   // 9 ÷ 5 = 1, resto 4
//10 % 5 = 0  // 10 ÷ 5 = 2, resto 0  ¡Otra vez vuelve a empezar!