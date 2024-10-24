package apuntesprofe;

import java.util.Scanner;

public class evaluacion6to3ra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer argumento: ");
        int a = scanner.nextInt();
        System.out.println("ingrese el segundo argumento: ");
        int b = scanner.nextInt();
        boolean resultado = espotencia(a,b);
        System.out.println("¿" + a + " es una potencia de " +b + "? " + resultado );
    }
    public static boolean espotencia(int a,int b){
        //casos base
        if (b <= 1) {
            return a == b;
        }
        if (a<b){
            return false;
        }
        // verificacion iterativa
        while   (a % b == 0){
            a/= b;

        }
        return a==1;
    }

}
