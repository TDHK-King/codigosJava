package apuntesprofe;

public class funciones {

    public static void saludar(String nombreSaludado) {
        System.out.println("Esta es la función saludar.");
        System.out.println("Hola " + nombreSaludado + "!");
    }

    public static boolean esPar(int numero) {
        boolean esPar;
        esPar = numero % 2 == 0;
        return esPar;
    }

    public int sumar(int num1, int num2) {
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