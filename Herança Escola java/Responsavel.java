import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Pessoa {
    private List<Student> alunos = new ArrayList<>();
    public Responsavel(String nome, int cpf, long telefone) {
        super(nome, cpf, telefone);
    }
    public void adicionarAluno(Student aluno) {
        alunos.add(aluno);
    }
    public void verAlunos() {
        for (Student aluno : alunos) {
            System.out.println(aluno);
        }
    }
}