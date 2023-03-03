package Ejercicio1;

public class EjercicioA {
    
    public static void main(String[] args) {
        
        System.out.println(contarAparicionesDeLetra('a', "Hola como estas"));
    }

    public static int contarAparicionesDeLetra(char letra, String string) {

        int apariciones = 0;
        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == letra) {
                apariciones = apariciones + 1;
            }
        }
        return apariciones;
    }
}
