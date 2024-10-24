package funciones;
import java.util.Scanner;

import static programas.funciones.*;
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese parametro minimo y luego parametro maximo: ");
        int resultado = enteroaleatorio(scanner.nextInt(), scanner.nextInt());
        System.out.println("el numero resultante de el proceso randomizador es: " + resultado);

    }
}
