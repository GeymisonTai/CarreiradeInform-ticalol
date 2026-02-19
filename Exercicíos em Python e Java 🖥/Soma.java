import java.util.Scanner;

public class Soma {
    public static void main(String[]args) {
    
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu numero bb: ");
    int A =scanner.nextInt();
    System.out.print("Digite seu numero bb: ");
    int B =scanner.nextInt();
    int Resultado= A + B;
    System.out.println("A soma do seus números foi: " + Resultado);
 
    scanner.close();
}
}
