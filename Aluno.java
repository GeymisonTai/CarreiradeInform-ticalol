import java.time.LocalTime;
public class Aluno{
    private String responsavel;
    private String nome;
    private int mtr;
    private int telefone;
    public Aluno(String nome,int mtr,String responsavel,int telefone){ 
        this.nome=nome;
        this.mtr=mtr;
        this.responsavel=responsavel;
        this.telefone=telefone;
    }
    
    public String Apresentaco(){
        return "Olá sou "+ nome + " minha responsável é a " + responsavel + " minha matricula é " + mtr+".Meu número é " +telefone + " do ano de ";
        }
    public int Horario(){
     int agora=LocalTime.now().getHour();
     if(5 <= agora >= 11){System.out.println("Bom dia");}
}
        public String Saudacao(String nome){
            return Horario() + nome;
            }

            public static void main(String[] args) {
    Aluno andre=new Aluno("Geymison",538317,"Maria do Socorro",99855857);
    System.out.println(andre.Apresentaco());
    System.out.println(andre.Saudacao("Geymison"));
}
 }
