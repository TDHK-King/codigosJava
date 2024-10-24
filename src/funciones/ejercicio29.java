package funciones;

import java.util.Scanner;
import static programas.funciones.*;
public class ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("coloque un el numero a verificar: ");
        boolean c= esprimo(scanner.nextInt());
        System.out.println("el resultado es " + c);


    }
}
