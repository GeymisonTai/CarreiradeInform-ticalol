import java.util.Arrays;
import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[20];
        int[] c = new int[30];

        for (int i = 0; i < 10; i++) {
            System.out.print("digite A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.print("digite B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < 20; i++) {
            c[i + 10] = b[i];
        }

        Arrays.sort(c);

        System.out.println("vetor c ordenado:");
        for (int i = 0; i < 30; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

