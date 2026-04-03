import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite uma frase:");
        String frase = scanner.nextLine().toLowerCase();

        char[] cons = new char[frase.length()];
        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!=' ') {
                cons[cont] = c;
                cont++;
            }
        }

        System.out.println("quantidade de consoantes: " + cont);
        System.out.print("consoantes: ");

        for (int i = 0; i < cont; i++) {
            System.out.print(cons[i] + " ");
            scanner.close();
        }
    }
}
