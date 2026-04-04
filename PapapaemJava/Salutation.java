import java.time.LocalTime;

public class Salutation {
private String name;
public Salutation(String name){
this.name=name;
}
public static String Agora(){
LocalTime agora=LocalTime.now();
   if (agora.getHour() > 5 && agora.getHour() < 12) {return "Bom dia,";} 
   else if (agora.getHour() > 12 && agora.getHour() < 18) {return("Boa tarde,");}
   else{return("Boa noite,");}
}
public String Oi(String name){
 return Agora() + this.name;

}

public static void main(String[] args) {
Salutation batata=new  Salutation("Geymison");    
System.out.println(batata.Oi("Geymison"));
}
}

