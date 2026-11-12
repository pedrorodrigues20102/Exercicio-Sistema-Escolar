import java.util.Scanner;

public class SeparadorDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] original = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];
        
        int qtdPos = 0;
        int qtdNeg = 0;
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            original[i] = scanner.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            if (original[i] > 0) {
                positivos[qtdPos] = original[i];
                qtdPos++;
            } else if (original[i] < 0) {
                negativos[qtdNeg] = original[i];
                qtdNeg++;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.print("Vetor de Positivos: ");
        if (qtdPos == 0) {
            System.out.println("Nenhum número positivo.");
        } else {
            for (int i = 0; i < qtdPos; i++) {
                System.out.print(positivos[i] + " ");
            }
            System.out.println();
        }
        System.out.print("Vetor de Negativos: ");
        if (qtdNeg == 0) {
            System.out.println("Nenhum número negativo.");
        } else {
            for (int i = 0; i < qtdNeg; i++) {
                System.out.print(negativos[i] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
