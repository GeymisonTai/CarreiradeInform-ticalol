import java.time.LocalDate;
import java.time.LocalTime;
public class Aluno {
  private String responsavel;
  private String nome;
  private int mtr;
  private long telefone;
  private LocalDate datanas;
public Aluno(String nome,int mtr,String responsavel,long telefone,LocalDate datanas){
   this.nome=nome;
   this.mtr=mtr;
   this.responsavel=responsavel;
   this.telefone=telefone;
   this.datanas=datanas;
}
public String Apresentacao(){
    return "Olá sou "+ nome +" minha matricula é "+ mtr + " minha responsavel é a "+ responsavel +
    "meu n de telefone é "+ telefone+" data de nascimento "+datanas;
}
 public static String Horario(){
   LocalTime agora=LocalTime.now();
   if (agora.getHour() > 5 && agora.getHour() < 12) {return "Bom dia,";} 
   else if (agora.getHour() > 12 && agora.getHour() < 18) {return("Boa tarde,");}
   else{return("Boa noite,");}
  }
public String Saudacao(String nome){  
    return Horario() + this.nome;
}
  public static void main(String[]args){
     Aluno andre=new Aluno ("Geymison",538317,"Maria do Socorro",85992341234L,
      LocalDate.of(2007, 12, 28));
     System.out.println(andre.Apresentacao());
     System.out.println(andre.Saudacao("Geymison"));
}
}

