import java.util.Scanner;

public class Comparaciondeasistencias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese asistencia del estudiante 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese asistencia del estudiante 2: ");
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

        // Determinar que estudiabnte tiene mejor asistencia
        if (numero1 > numero2) {
            System.out.println("El estudiante 1 tiene mejor asistencia.");
        } else if (numero2 > numero1) {
            System.out.println("El estudiante 2 tiene mejor asistencia.");
        } else {
            System.out.println("Ambos estudiantes tienen la misma asistencia.");
        }

        // Calcular la diferencia de asistencia
        int diferencia = Math.abs(numero1 - numero2);

        System.out.println("La diferencia de asistencia es: " + diferencia);
    }
}
