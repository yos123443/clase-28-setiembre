import java.util.Scanner;

public class Comparaciondesalarios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese el sueldo 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese el sueldo 2: ");
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

        // Determinar que practicante gana más
        if (numero1 > numero2) {
            System.out.println("El practicante 1 gana más.");
        } else if (numero2 > numero1) {
            System.out.println("El practicante 2 gana más.");
        } else {
            System.out.println("Ambos practicantes ganan lo mismo.");
        }

        // Calcular la diferencia salarial
        int diferencia = Math.abs(numero1 - numero2);

        System.out.println("La diferencia salarial: " + diferencia);
    }
}
