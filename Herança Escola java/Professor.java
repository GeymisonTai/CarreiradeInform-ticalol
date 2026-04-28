public class Professor extends Aluno{
private String titulo;
 public Professor(String nome,int cpf,long telefone,int mtr,String titulo){
    this.titulo=titulo;
    super(nome,cpf,telefone,mtr,titulo);

 }
 public String Ensinar(){
return "Quero ensinar meus alunos com dedicação, inspirando cada um a descobrir seu potencial e a nunca parar de aprender.E sou formado em "+titulo;
}
  }