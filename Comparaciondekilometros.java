import java.util.Scanner;

public class Comparaciondekilometros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese kilómetros del conductor 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese kilómetros del conductor 2: ");
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

        // Determinar que conductor recorrio más
        if (numero1 > numero2) {
            System.out.println("El conductor 1 recorrio más kilómetros.");
        } else if (numero2 > numero1) {
            System.out.println("El conductor 2 recorrio más kilómetros.");
        } else {
            System.out.println("Ambos conductores recorrieron lo mismo.");
        }

        // Calcular la diferencia de kilometros
        int diferencia = Math.abs(numero1 - numero2);

        System.out.println("La diferencia de kilómetros es: " + diferencia + "km");
    }
}
