import java.util.Scanner;
public class OPMatemática {
    public static void main(String [] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu numero bb: ");
    int a =scanner.nextInt();
    System.out.print("Digite seu numero bb: ");
    int b =scanner.nextInt();
    int Soma= a + b;
    int Subtração= a - b;
    int Multiplicação= a * b;
    int Divisão= a / b;
    System.out.println("Soma: " + Soma);
    System.out.println("Subtração: " + Subtração);
    System.out.println("Multiplicação: " + Multiplicação);
    System.out.println("Divisão: " + Divisão);
    
     scanner.close();

    }
    
}
