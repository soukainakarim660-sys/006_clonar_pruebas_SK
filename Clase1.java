import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0; 
        double numero, media;
        System.out.println("Introduce los 20 numeros: ");
        for (int i = 0; i < 20; i++) {
            numero = teclado.nextDouble();
            suma += numero;
        }
        media = suma / 20;
        System.out.println("La media de los numeros es: " + media);

        teclado.close();
    }
}