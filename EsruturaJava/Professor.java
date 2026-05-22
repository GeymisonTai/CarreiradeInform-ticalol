public class Professor extends Aluno {
    private String titulo;
    
    public Professor(String nome, double cpf, long telefone, int mtr, String titulo) {
        super(nome, cpf, telefone, mtr);
        this.titulo = titulo;
    }
    
    public String Ensinar() {
        return "Quero ensinar meus alunos com dedicação, inspirando cada um a descobrir seu potencial e a nunca parar de aprender. E sou formado em " + this.titulo;
    }
    
    public String gettitulo() {
        return titulo;      
    }

    @Override
    public String Apresentar() {
        return "Bom dia caro professor(a), vossa senhoria está bem? O seu título é " + gettitulo();
      
    }
}
