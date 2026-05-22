import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Pessoa {
    private List<Aluno> alunos = new ArrayList<>();
    
    public Responsavel(String nome, double cpf, long telefone) {
        super(nome, cpf, telefone);
    }
    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void verAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getnome());
        }
    }
    
    @Override
    public String Apresentar() {
        return "Oi meu responsável, que saudades.";
       
    }
}
