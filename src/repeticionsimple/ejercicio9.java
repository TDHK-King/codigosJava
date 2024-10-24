package repeticionsimple;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int num1 = 10;
        System.out.println("ingrese la cantidad de veces que desea que se imprima el numero: ");
        int veces = scanner.nextInt();
        while  (a<veces) {
        ++a;
            System.out.println(num1);


        }

    }
}
