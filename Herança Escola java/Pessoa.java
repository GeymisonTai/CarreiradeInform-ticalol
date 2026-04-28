public class Pessoa {
    private String nome;
    private int cpf;
    private long telefone;
    public  Pessoa(String nome,int cpf,long telefone){
 this.nome=nome;
 this.cpf=cpf;
 this.telefone=telefone;
    }
    public String Apresentar(){
        return "Olá meu nome é "+ this.nome +" meu cpf é "+ this.cpf +" e meu número é:"+this.telefone;      
    }
}  



