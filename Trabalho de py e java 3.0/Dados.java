import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
public class Dados{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String Nome=scanner.nextLine();
    System.out.print("Digite sua idade: ");
    int Idade=scanner.nextInt();
////vontade de dormir slk
System.out.print("Dia (dd): ");
        int dia = scanner.nextInt();
        System.out.print("Mês (mm): ");
        int mes = scanner.nextInt();
        System.out.print("Ano (aaaa): ");
        int ano = scanner.nextInt();
    LocalDate Nascimento = LocalDate.of(ano, mes, dia);
    System.out.println("Data de nascimento: " + Nascimento);
////////////////////////////////////////////////////
    LocalTime agora=LocalTime.now();
if (agora.getHour() > 5 && agora.getHour() < 12) {System.out.println("Bom dia.");} 
else if (agora.getHour() > 12 && agora.getHour() < 18) {System.out.println( "Boa tarde.");}
else{System.out.println("Boa noite.");}
///////////////////////////////////////////////////
if (Idade >= 18){System.out.println("Pode entrar no Bar.");}
else{System.out.println("Sai daqui,pirralho(a)!");}

    scanner.close();

    }
}