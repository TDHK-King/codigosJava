package UNIDAD3;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[][] matriz = new String[2][2];
        matriz [0][0] = "nombre";
        matriz [0][1] = "Apellido";

        matriz [1] [0] = scanner.nextLine();
        matriz [1] [1] = scanner.nextLine();

        System.out.println(matriz[0][0] + " " + matriz[0][1] );
        System.out.println(matriz[1][0] + " " + matriz[1][1]);

    }
}
