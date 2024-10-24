package evaluacion;

public class evaluacionHecha {

        public static int minimoComunMultiplo(int num1, int num2) {

            if (num1 < 0) {
                System.out.println("El numero 1 no es válido");
                return -1;
            }
            if (num2 < 0) {
                System.out.println("El numero 2 no es válido");
                return -1;
            }
            if (num1 == 0) {
                return 0;
            }
            if (num2 == 0) {
                return 0;
            }
            int res = 2;
            int a = 1;

            if (num1 == num2) {
                return num1;
            }

            if (num1 < num2) {
                while (res % num2 != 0) {
                    res = num1 * a;
                    a++;
                }
            }
            if (num2 < num1) {
                while (res % num1 != 0) {
                    res = num2 * a;
                    a++;
                }
            }

            return res;
        }

}