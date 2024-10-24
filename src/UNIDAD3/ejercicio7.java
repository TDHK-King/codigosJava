package UNIDAD3;

import java.util.Scanner;
import static UNIDAD3.ejercicio1.*;
import static UNIDAD3.funciones.imprimirVector.*;
public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("ingrese dimension, num min, y maximo del vector en ese orden: ");
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int nummin = scanner.nextInt();
        int nummax = scanner.nextInt();
        int [] resultado = vectorAleatorio(dimension,nummin,nummax);
        imprimirV(resultado);
    }

}
