import java.util.Scanner;
public class Clase2 {

    public static void main(String[] args) {
        int año;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        año = teclado.nextInt();

        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            System.out.println("Este año " + año + " es bisiesto.");
        } else {
            System.out.println("Este año " + año + " no es bisiesto.");
        }

        teclado.close(); 
    }
}