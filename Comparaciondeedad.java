import java.util.Scanner;

public class Comparaciondeedad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese edad del trabajador 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese edad del trabajador 2: ");
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

        // Determinar que trabajador es mayor
        if (numero1 > numero2) {
            System.out.println("El trabajador 1 es mayor.");
        } else if (numero2 > numero1) {
            System.out.println("El trabajador 2 es mayor.");
        } else {
            System.out.println("Ambos trabajadores tienen la misma edad.");
        }

        // Calcular la diferencia de edad entre ambos trabajadores
        int diferencia = Math.abs(numero1 - numero2);

        System.out.println("La diferencia de edad es: " + diferencia);
    }
}
