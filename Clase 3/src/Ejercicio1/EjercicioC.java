package Ejercicio1;

public class EjercicioC {
    
    public static void main(String[] args) {
        
        int[] numeros = new int[] {1, 3, 5, 10, 15, 25, 50, 100};

        int sumaTotal = sumarNumerosMayoresA(5, numeros);

        System.out.println("La suma total es de: " + sumaTotal);
    }

    public static int sumarNumerosMayoresA(int numeroUmbral, int[] numerosASumar) {

    int sumaTotalHastaAhora = 0;

    for (int i = 0; i < numerosASumar.length; i++) {
        if (numerosASumar[i] > numeroUmbral) {
            sumaTotalHastaAhora += numerosASumar[i];
        }
    }

    return sumaTotalHastaAhora;
    }
}
