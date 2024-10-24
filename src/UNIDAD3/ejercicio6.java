package UNIDAD3;



public class ejercicio6 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        int num = 11;
        for (int i = 0;i < 10;i++){
        vector[i] = num -= 1;
        }
        imprimirV(vector);




    }
    public static void imprimirV(int[] vector) {
        for (int n = 0; n < vector.length; n++)
            System.out.println(vector[n]);


    }

}
// un programa que llene un vector de dimension 10 con numeros del 10-1 de manera descendente y luego lo imprima