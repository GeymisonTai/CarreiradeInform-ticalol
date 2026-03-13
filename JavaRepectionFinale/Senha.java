import java.util.Scanner;
public class Senha{
 public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
 String senhacorreta="SensoComum";
 System.out.print("Digite a senha: ");
String senha=scanner.nextLine();
 while (!senha.equals(senhacorreta)) {
System.out.println("Senha incorreta!");
System.out.print("Digite a senha: ");
senha=scanner.nextLine();
 }
System.out.println("Bem vindo usuário!! ");
scanner.close();
} 
}