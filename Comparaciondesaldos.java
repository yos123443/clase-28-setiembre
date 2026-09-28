import java.util.Scanner;

public class Comparaciondesaldos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Ingrese saldo de la cuenta 1: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese saldo de la cuenta 2: ");
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

        // Determinar que cuenta tiene mayor saldo
        if (numero1 > numero2) {
            System.out.println("la cuenta 1 tiene mayor saldo.");
        } else if (numero2 > numero1) {
            System.out.println("la cuenta 2 tiene mayor saldo.");
        } else {
            System.out.println("Ambos cuentas tienen el mismo saldo.");
        }

        // Calcular la diferencia de saldos
        int diferencia = Math.abs(numero1 - numero2);

        System.out.println("La diferencia es de: " + diferencia + "s/");
    }
}
