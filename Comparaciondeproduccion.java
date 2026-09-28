import java.util.Scanner;

public class Comparaciondeproduccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese producción de la fabrica 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese producción de la fabrica 2: ");
        numero2 = entrada.nextInt();

        System.out.println();

        System.out.print(numero1 + " es mayor que " + numero2 + ": ");
        System.out.println(numero1 > numero2);

        System.out.print(numero1 + " es menor que " + numero2 + ": ");
        System.out.println(numero1 < numero2);

        System.out.print(numero1 + " es mayor o igual que " + numero2 + ": ");
        System.out.println(numero1 >= numero2);

        System.out.print(numero1 + " es menor o igual que " + numero2 + ": ");
        System.out.println(numero1 <= numero2);

        System.out.print(numero1 + " es igual a " + numero2 + ": ");
        System.out.println(numero1 == numero2);

        System.out.print(numero1 + " es diferente de " + numero2 + ": ");
        System.out.println(numero1 != numero2);

        System.out.println();

        // Determinar que fábria produjo más
        if (numero1 > numero2) {
            System.out.println("la fábrica 1 produjo más.");
        } else if (numero2 > numero1) {
            System.out.println("la fábrica 2 produjo má.");
        } else {
            System.out.println("Ambos fábricas produjeron lo mismo.");
        }

        // Calcular la diferencia de producción
        int diferencia = Math.abs(numero1 - numero2);

        System.out.println("La diferencia de producción es: " + diferencia);
    }
}
