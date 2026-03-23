import java.util.Scanner;

public class NotasCinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("digite seus numeros " + i + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("valores digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        
        double media = java.util.Arrays.stream(numeros).average().orElse(0.0);

        int maior = java.util.Arrays.stream(numeros).max().orElse(Integer.MIN_VALUE);

        int menor = java.util.Arrays.stream(numeros).min().orElse(Integer.MAX_VALUE);

        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        entrada.close();
    }
} 
