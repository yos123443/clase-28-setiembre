import java.util.Scanner;

public class Comparaciondeconsumoelectrico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese consumo del hogar 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese consumo del hogar 2: ");
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

        // Determinar que hogar consume mas energía
        if (numero1 > numero2) {
            System.out.println("el hogar 1 consume mas energía.");
        } else if (numero2 > numero1) {
            System.out.println("el hogar 2 consume mas energía.");
        } else {
            System.out.println("Ambos hogares consumen lo mismo.");
        }

        // Calcular la diferencia de consumo de hogares
        int diferencia = Math.abs(numero1 - numero2);

        System.out.println("La diferencia es: " + diferencia + "kwh");
    }
}
