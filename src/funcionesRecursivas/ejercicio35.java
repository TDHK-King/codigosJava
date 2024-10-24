package funcionesRecursivas;

import java.util.Scanner;

public class ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese un digito para realizar la suma: ");
        int num = scanner.nextInt();
        int resultado = suma(num);
        System.out.println("el resultado de la suma de los digitos es: " + resultado);
    }
    public static int suma(int num){
        //caso base
        if (num == 0){
            return 0;
        }else {
            //caso recursivo
            return (num % 10) + suma(num/10);
        }

    }
}
