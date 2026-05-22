public class Funcionario extends Pessoa {
    private int cod;
    private String funcao;
    
    public Funcionario(String nome, double cpf, long telefone, int cod, String funcao) {
        super(nome, cpf, telefone);
        this.cod = cod;
        this.funcao = funcao;
    }
    
    public String Desempenhar() {
        return "O funcionário escolar é o alicerce invisível que transforma o ambiente de ensino em um verdadeiro lar para o conhecimento. Com a minha " + this.funcao + " e meu código é " + this.cod;
    }
    
    public int getCod() {
        return cod;      
    }
    
    public String getfuncao() {
        return funcao;      
    }

    @Override
    public String Apresentar() {
        return "Bom dia, Senhor(a),"+getnome()+" seu código:" + getCod() + " Funcionário(a) de " + getfuncao();

    }
}
