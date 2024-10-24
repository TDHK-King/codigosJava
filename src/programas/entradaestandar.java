package programas;

import java.util.Scanner;

public class entradaestandar {
    public static void main(String[] args) {
        //en pseint haciamos "leer mivariable", pero en java es necesario que creemos un objeto que se encargue de leer

        int miEntero;
        double miFlotante;
        String miTexto;
        Scanner teclado = new Scanner(System.in);
        //clase + Identificador = new Clase(argumentos)

        //leer miEntero
        // En la variable miEntero guardar la variable ingresada por teclado
        //miEntero = teclado.nextInt();
        //miFlotante = teclado.nextDouble();
        //miTexto = teclado.nextLine();

        //Escribir un programa que solicite:
        //edad
        //altura
        //nombre
        //imprimir:Mi nombre es + nombre + tengo + Edad + años + Mido + metros de altura

        int miEdad;
        double miAltura;
        String miNombre;
        System.out.println("ingrese su edad");
        miEdad = teclado.nextInt();
        //miEdad = Integer.parseInt(ent.nextLine());
        System.out.println("ingrese su altura");
        miAltura = teclado.nextDouble();
        //miAltura = Double.parseDouble(ent.nextLine());
        System.out.println("ingrese tu nombre");
        teclado.nextLine();
        miNombre = teclado.nextLine();


        System.out.println("mi nombre es " + miNombre + ",tengo " + miEdad + " años" + " y mido " + miAltura + " metros de altura");







    }






}
