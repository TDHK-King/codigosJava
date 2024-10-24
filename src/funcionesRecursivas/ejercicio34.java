package funcionesRecursivas;

import java.util.Scanner;

public class ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un parametro para la suma de numeros naturales: ");
        int num = scanner.nextInt();
        int resultado= suma(num);
        System.out.println("el resultado es: " + resultado);

    }
    public static int suma(int n){
        //caso base:
        if (n <= 1){
            return 1;
        }else {
            //caso recursivo
            return n + suma(n-1);

        }
    }

}
