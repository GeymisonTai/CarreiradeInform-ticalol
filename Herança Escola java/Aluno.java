public class Aluno extends Pessoa{
private int mtr;
 public Aluno(String nome,int cpf,long telefone,int mtr){
    this.mtr=mtr;
     super(nome,cpf,telefone,mtr);
 }
 public String Aprender(){
return "Eu quero aprender, crescer e descobrir até onde sou capaz de chegar.E minha matricula é "+matricula;

 }
}