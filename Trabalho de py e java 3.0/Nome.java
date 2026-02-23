import java.util.Scanner;
 public class Nome{
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String Nome=scanner.nextLine();
    System.out.println(Nome);

    scanner.close();
  }

}