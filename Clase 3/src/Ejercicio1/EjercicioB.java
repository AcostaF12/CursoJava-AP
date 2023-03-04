package Ejercicio1;

import java.util.Arrays;

public class EjercicioB {
    
    public static void main(String[] args) {
        
        int [] vectorResultante = ordenarVectorEnOrden(126, 35, 92, "descendente");

        System.out.println(Arrays.toString(vectorResultante));
    }

    public static int[] ordenarVectorEnOrden(int numero1, int numero2, int numero3, String orden) {
        
        int [] vectorOrdenado = new int[] {numero1, numero2, numero3};
        Arrays.sort(vectorOrdenado);

        if (orden.equalsIgnoreCase("descendente")) {

            int[] vectorInvertido = new int[vectorOrdenado.length];

            for (int i = vectorOrdenado.length - 1, j = 0; i >= 0; i--, j++) {
                vectorInvertido[j] = vectorOrdenado[i];
            }

            vectorOrdenado = vectorInvertido;
        }

        return vectorOrdenado;
    }
}
