public class Funcionario extends Pessoa {
    private int cod;
    private String funcao;
public Funcionario(String nome,int cpf,long telefone,int cod,String funcao){
    this.cod=cod;
    this.funcao=funcao;
    super(nome,cpf,telefone,cod,funcao);
}
public String Desenpenhar(){
return "O funcionário escolar é o alicerce invisível que transforma o ambiente de ensino em um verdadeiro lar para o conhecimento.Com a minha "+funcao+ " e meu código é "+cod;


}


}
