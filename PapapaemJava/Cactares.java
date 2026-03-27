import java.util.Scanner;
public class Cactares {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite sua frase: ");
    String frase=scanner.nextLine();
    
    int tamanho=frase.length();

    System.out.println("tem essse número de caracteres:"+tamanho);

scanner.close();

    }
}
