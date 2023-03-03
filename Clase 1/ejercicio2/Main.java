package ejercicio2;

public class Main {

    public static void main(String[] args) {

        int ingresosMensuales = 450000;
        int cantidadVehiculosModernos = 1;
        int cantidadInmuebles = 2;
        boolean tieneEmbarcaciones = true;
        boolean tieneAeronavesDeLujo = false;

        if (ingresosMensuales >= 489083 ||
                cantidadVehiculosModernos >= 3 ||
                cantidadInmuebles >= 3 ||
                tieneEmbarcaciones ||
                tieneAeronavesDeLujo) {
            System.out.println("Pertenece al segmento de ingresos altos");
        }
        else {
            System.out.println("Pertenece al segmento de ingresos bajos");
        }
    }
}
