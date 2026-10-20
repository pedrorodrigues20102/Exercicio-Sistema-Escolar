public class Sistema {
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Faltas: ");
        int faltas = sc.nextInt();

        
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Erro: As notas devem estar entre 0 e 10.");
            sc.close();
            return;
        }

        
        double media = (nota1 + nota2) / 2.0;
        System.out.printf("Média: %.2f%n", media);

        
        if (faltas > 25) {
            System.out.println("Situação: Reprovado por falta");
        } else if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 4.0) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado por nota");
        }

        sc.close();
    }
}
    

