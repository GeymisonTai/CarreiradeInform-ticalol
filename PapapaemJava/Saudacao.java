import java.time.LocalTime;
import java.util.Scanner;

public class Saudacao {
public static void main(String[]args) {
Scanner scanner=new Scanner(System.in);
System.out.print("Digite seu nome: ");
String nome=scanner.nextLine();
LocalTime agora=LocalTime.now();
    
System.out.print(nome+",");
if (agora.getHour() > 5 && agora.getHour() < 12) {System.out.println("Bom dia!!");} 
else if (agora.getHour() > 12 && agora.getHour() < 18) {System.out.println("Boa tarde.");}
else if(agora.getHour()>18 && agora.getHour()<23){System.out.println("Boa noite...");}
else{System.out.println("Vai dormir,praga ❤");}

scanner.close();        
    }
    
}
