package programas;

import java.util.Random;
public class funciones {
public static int debinarioadecimal(int binario){
    int decimal = 0;
    int potencia = 1;
    while (binario>0){
        int bit = binario % 10;
        decimal+=bit*potencia;
        potencia*=2;
        binario/=10;

    }
    return decimal;

}






    public static boolean esprimo(int num){
    if (num <= 1){
        return false;

    }
    for (int i =2; i<= num/2;i++){
        if (num % i == 0){
            return false;
        }

    }
    return true;

}





    public static int max(int num1,int num2){
        if(num1<num2){
        return num2;
        }else return num1;

    }





    public static boolean esPer(int num){
        boolean espar;
        return espar = num % 2 == 0;



    }





   public static double areacirculo(double radio){
       return Math.PI * potencia(radio,2);
   }






    public static int enteroaleatorio(int min, int max){
        Random random =new Random();
        return random.nextInt((max - min) + 1 )+ min;


    }





    public static double potencia(double base, int exponente) {
        int a =0;
        double bouser;
        bouser = base;
        while (a<exponente-1){
            a++;

            base *= bouser;
        }
        return base;

    }



    public static void saludar(String nombreSaludado) {
        System.out.println("Esta es la función saludar.");
        System.out.println("Hola " + nombreSaludado + "!");
    }

    public static boolean esPar(int numero) {
        boolean esPar;
        esPar = numero % 2 == 0;
        return esPar;
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;

    }

    public static boolean sonIguales(double num1, double num2, double tolerancia) {
        return (num1 - num2 <= tolerancia) && (num1 - num2 >= -1 * tolerancia);
    }

    public static double raizCuadrada(double area) {

        double tolerancia = 0.00001;
        double base = area;
        double altura = 1;

        while (!sonIguales(base, altura, tolerancia)) {
            base = (base + altura) / 2;
            altura = area / base;
        }

        return base;

    }

    public static int factorialViejaEscuela(int n) {

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorial (int n)  {

        if (n > 1) {
            return factorial(n - 1) * n;
        } else {
            return 1;
        }
    }
}
