import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analisador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        final int TOTAL_NUMEROS = 10;
        System.out.println("Digite " + TOTAL_NUMEROS + " números inteiros:");
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numeros.add(num);
        }
        int soma = 0;
        int maior = numeros.get(0);
        int menor = numeros.get(0);
        int pares = 0;
        int impares = 0;
        for (int num : numeros) {
            soma += num;
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        double media = (double) soma / TOTAL_NUMEROS;
        System.out.println("\n--- Resultados ---");
        System.out.println("Média dos números: " + media);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}
