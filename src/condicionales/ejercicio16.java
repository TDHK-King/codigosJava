package condicionales;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero del cual desea el valor absoluto: ");
        int num1 = scanner.nextInt();
        if (num1<0) {
            int numabsoluto = - num1;
                    System.out.println("el valor absoluto es: " + numabsoluto);
        }else {
            System.out.println("el valor absoluto es: " + num1);
        }
        }
}
