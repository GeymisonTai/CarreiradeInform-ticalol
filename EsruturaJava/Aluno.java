import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridLayout;

public class Aluno extends Pessoa{
private int mtr;
 public Aluno(String nome,double  cpf,long telefone,int mtr){
    super(nome,cpf,telefone);
    this.mtr=mtr;
 }
 public String Aprender(){
return "Eu quero aprender, crescer e descobrir até onde sou capaz de chegar.E minha matricula é "+this.mtr;

}
public int getMtr(){
 return mtr;      
}

     @Override
      public String Apresentar(){
     return "Eae aluno fudido ,"+getnome()+" sua matricula é:" + getMtr() + " e seu telefone é " + gettelefone();
   }
    public void exibirJanela() {
        JFrame frame = new JFrame("Dados do Aluno");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));
        
        Font fonte = new Font("Arial", Font.BOLD, 14);
        
        JLabel labelDados = new JLabel("Olá aluno fudido," + getnome()+" como vai?Enfim seu cpf é "
        +getcpf()+" seu telefone é"+ gettelefone()+" sua matricula é "+ getMtr());
        labelDados.setFont(fonte);
        panel.add(labelDados);
        
        
        frame.add(panel);
        frame.setVisible(true);
}
}

