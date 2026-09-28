import java.util.Scanner;

public class Comparaciondebecas {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero1;
            int numero2;

            System.out.print("Ingrese promedio del estudiante 1: ");
            numero1 = entrada.nextInt();

            System.out.print("Ingrese promedio del estudiante 2: ");
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

            // Determinar cuál estudiante obtuvo el mejor promedio
            if (numero1 > numero2) {
                System.out.println("El estudiante 1 obtiene la beca.");
            } else if (numero2 > numero1) {
                System.out.println("El estudiante 2 obtiene la beca.");
            } else {
                System.out.println("Ambos estudiantes obtienen la beca.");
            }
        }
    } // Fin del método main
} // Fin de la clase Lectura