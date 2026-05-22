import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;

public class Pessoa {
    private String nome;
    private double cpf;
    private long telefone;
    
    public Pessoa(String nome, double cpf, long telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getnome() {
        return nome;      
    }
    
    public double getcpf() {
        return cpf;      
    }
    
    public long gettelefone() {
        return telefone;      
    }

    public String Apresentar() {
        return "Olá meu nome é " + getnome() + " meu cpf é " + getcpf() + " e meu número é:" + gettelefone();      
    }

    public String Apresentar(Pessoa pessoa) {
        return "Eae meu mano " + pessoa.getnome();
    }
    
    public String Apresentar(Aluno aluno) {
        return "Ola aluno " + aluno.getnome();
    }

    public String Apresentar(Professor professor) {
        return "Bom dia professor " + professor.getnome();
    }

    public String Apresentar(Responsavel responsavel) {
        return "Oi responsável " + responsavel.getnome();
    }

    public String Apresentar(Funcionario funcionario) {
        return "Eae funcionário " + funcionario.getnome();
    }


}
