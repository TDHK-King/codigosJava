package ejerciciosmixtos;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numreferencia;
        int nummayor1 = 0;
        int nummayor2 = 0;
        for (numreferencia = 0;numreferencia<10;numreferencia++){
            System.out.println("ingrese un numero a comparar: ");
            int num1 = scanner.nextInt();
            if (num1>nummayor1){
                    nummayor2 = nummayor1;
                    nummayor1 = num1;
            }
            else if (num1>nummayor2){
                    nummayor2 = num1;

            }
        }
        System.out.println("el primer numero mayor es " + nummayor1);
        System.out.println("el segundo numero mayor es " + nummayor2 );
    }
}
