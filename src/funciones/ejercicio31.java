package funciones;

import static programas.funciones.*;

import java.util.Scanner;

public class ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese el numero del que desee calcular la raiz cuadrada: ");
        double resultado = raizCuadrada(scanner.nextInt());
        System.out.println("la raiz cuadrada es: " + resultado);

    }


}
