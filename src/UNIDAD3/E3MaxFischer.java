package UNIDAD3;


///1) Entender la logica
///2) dividir el problema en subproblemas en papel
///3) resolver en pseudocodigo en papel
///4) llevar a codigo



public class E3MaxFischer {
    public static void main(String[] args) {
            // 1. Caso de prueba simple
            int[] prueba = {1, 2, 3, 4, 5, 6};
            System.out.println("Entrada:");
            imprimirArray(prueba);




            // 2. Llamada al métod
            int[] resultado = tuMetodo(prueba, 2);




            // 3. Verificación
            System.out.println("Salida:");
            imprimirArray(resultado);
        }

        public static int[] tuMetodo(int[] array, int k) {




            // 1. Validación
            if (array == null || k <= 0) {
                throw new IllegalArgumentException("Entrada inválida");
            }





            // 2. Variables necesarias
            int[] resultado = array.clone();




            // 3. Lógica principal
            for (int i = 0; i < array.length; i += k) {
                // Procesar grupos
            }





            return resultado;
        }






        // Métodos auxiliares útiles
        private static void imprimirArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
