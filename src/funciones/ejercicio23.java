package funciones;
import java.util.Scanner;

import static programas.funciones.*;
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 2 numeros a comparar y luego una tolerancia para la comparacion: ");
        boolean resultado = sonIguales(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(resultado);




    }
}
