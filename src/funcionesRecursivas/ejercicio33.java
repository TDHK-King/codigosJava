package funcionesRecursivas;

import java.util.Scanner;

public class ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese una posicion en la tabla de fibonacci: ");
        int num = scanner.nextInt();
        int resultado= fibonacci(num);
        System.out.println("el numero seleccionado es equivalente a: " + resultado);


    }
    public static int fibonacci(int num){
        //casos base
        if (num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }else {
            //caso recursivo
            return fibonacci(num - 1) + fibonacci(num - 2);
        }

    }



}
