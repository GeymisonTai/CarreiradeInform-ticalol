import java.time.LocalTime;
import java.util.Scanner;

public class Saudacao {
    public static void main(String[]args) {
    Scanner scanner=new Scanner(System.in);
    LocalTime agora=LocalTime.now();
    

if (agora.getHour() > 5 && agora.getHour() < 12) {System.out.println("Bom dia!!");} 
else if (agora.getHour() > 12 && agora.getHour() < 18) {System.out.println("Boa tarde.");}
else if(agora.getHour()>18 && agora.getHour()<23){System.out.println("Boa noite..zz");}
else{System.out.println("Vai dormir,praga ❤");}

    scanner.close();

    
        
    }
    
}
