import java.util.Arrays;
import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[20];
        int[] c = new int[30];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print("Digite B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        Arrays.sort(c);

        System.out.println("Vetor C ordenado:");
        for (int num : c) {
            System.out.print(num + " ");
        scanner.close();

        }

    }
}



