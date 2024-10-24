package apuntesprofe;

import java.util.Scanner;

public class variablesentradaestandar {

    public static void main(String[] args) {

        int miEntero;
        double miFlotante;
        String miTexto;
        Scanner teclado = new Scanner(System.in);

        miEntero = teclado.nextInt();           // Leemos un entero
        miFlotante = teclado.nextDouble();      // Leemos un flotante
        miTexto = teclado.nextLine();           // Leemos texto

    }
}