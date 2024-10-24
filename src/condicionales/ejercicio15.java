package condicionales;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
          if (num2%num1==0){
            System.out.println("el numero es multiplo");
          }
            else{
            System.out.println("el numero no es multiplo");
        }
            }
}
