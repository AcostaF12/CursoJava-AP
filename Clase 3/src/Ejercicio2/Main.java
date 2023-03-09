package Ejercicio2;

public class Main {
    
    public static void main(String[] args) {
        
        String cadenaSinCodificar = "hola que tal";
        String cadenaCodificada = "";

        for(int i = 0; i < cadenaSinCodificar.length(); i++) {
            if (cadenaSinCodificar.codePointAt(i) == 32) {
                cadenaCodificada += 'a';
            } else {
                cadenaCodificada += (codificarCaracter(cadenaSinCodificar.charAt(i), 1));
            }
        }

        System.out.println(cadenaCodificada);
    }

    public static char codificarCaracter(char caracter, int desplazamiento) {

        char caracterSinCodificar = caracter;

        char caracterCodificado = (char)((int)caracterSinCodificar + desplazamiento);

        return caracterCodificado;
    }
}
