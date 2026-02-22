import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Horario {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    LocalTime agora=LocalTime.now();
    DateTimeFormatter formador=DateTimeFormatter.ofPattern("HH:mm");
    System.out.print(agora.format(formador));

if (agora.getHour() > 5 && agora.getHour() < 12) {System.out.println(",Bom dia!!");} 
else if (agora.getHour() > 12 && agora.getHour() < 18) {System.out.println(",Boa tarde.");}
else if(agora.getHour()>18 && agora.getHour()<23){System.out.println(",Boa noite..zz");}
else{System.out.println("Vai dormir,praga ❤");}

    scanner.close();
    }
}
