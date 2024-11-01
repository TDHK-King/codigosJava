package UNIDAD3;

public class imprimirMatriz {
    public static void main(String[] args) {

    }
    public static void imprimirMatriz(int[][] matriz){

        System.out.println("la matriz ingresada es: ");
        for (int i = 0;i < matriz.length;i++){

            for (int j = 0;j < matriz[i].length;j++){
                System.out.printf("%6d" , matriz[i][j]);
            }
            System.out.println(" ");
        }




    }

}
