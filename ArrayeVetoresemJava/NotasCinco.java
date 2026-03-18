import java.util.Scanner;

public class NotasCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double num = sc.nextDouble();

            soma += num;

            if (i == 1) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        }

        System.out.println("Média: " + (soma / 5));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}
