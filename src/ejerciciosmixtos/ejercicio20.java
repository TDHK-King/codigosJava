package ejerciciosmixtos;
import static  programas.funciones.*;
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        double promedio;
        int numeroingresado;
        int totalnumerosingresados = 10;
        int cantidaddepares = 0;
        double sumapares = 0;
        int i;

        Scanner scanner = new Scanner(System.in);
        for (i = 0;i < totalnumerosingresados; i++){
            System.out.println("ingrese un numero entero: ");
            numeroingresado = scanner.nextInt();


            if (esPar(numeroingresado)){
                cantidaddepares++;
                sumapares += numeroingresado;
            }
        }
        promedio = sumapares / cantidaddepares;
        System.out.println(promedio);
    }
}
