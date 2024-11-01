package UNIDAD3;


public class busquedaEntero {

    public static int busquedaEntero(int[] vector, int entero){
        for (int i = 0;i < vector.length;i++){

            if (entero == vector[i]){
                return i;
            }
        }

    return -1;
    }


}
