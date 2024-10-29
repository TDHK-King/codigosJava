package UNIDAD3;

import static UNIDAD3.ejercicio1.*;
import  static UNIDAD3.funciones.imprimirVector.*;
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        int [] vector1 = vectorAleatorio(6,0,10);
        imprimirV(vector1);
        System.out.println("la ganancia resultante es igual a :  " + maximaGanancia(vector1));
    }


    public static int maximaGanancia(int [] precios){
        Scanner scanner= new Scanner(System.in);
        System.out.println("elija un dia para comprar acciones :");
        int compra = precios[scanner.nextInt() - 1];
        System.out.println("ahora ingrese un dia para vender esa misma accion: ");
        int venta = precios[scanner.nextInt() - 1];
        if (venta < compra){
            throw new IllegalArgumentException("el dia de venta no puede ser menor al dia de compra");
         }
        int ganancia = venta - compra;
        return ganancia;

    }



}
