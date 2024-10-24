package operadores;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba el numerador y presione enter ");
        int num2 = scanner.nextInt();
        System.out.println("escriba el denominador y presione enter ");
        double num1 = scanner.nextDouble();
        num2 /= num1;
        System.out.println("el cociente resultante es: " + num2 );



    }
}
