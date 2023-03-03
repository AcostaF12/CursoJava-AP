package ejercicio1;

public class Main {
    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;

        System.out.println("Numeros filtrados en rango:");
        while (numeroInicio <= numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio++;
        }

        numeroInicio = 5;

        System.out.println("Numeros pares filtrados en rango:");
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }
            else {
            }
            numeroInicio++;
        }

        numeroInicio = 5;
        int moduloResultante = 1;

        System.out.println("Numeros filtrados en rango segun criterio:");
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == moduloResultante) {
                System.out.println(numeroInicio);
            }
            else {
            }
            numeroInicio++;
        }

        numeroInicio = 5;
        System.out.println("Numeros filtrados con for:");
        for (int i = numeroInicio; i <= numeroFin; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            else {
            }
        }
    }
}