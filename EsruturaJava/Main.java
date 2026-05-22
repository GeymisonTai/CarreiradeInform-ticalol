import javax.swing.JFrame; 
import javax.swing.SwingUtilities;

public class Main {
    public static void main (String[]args){
        Pessoa g1=new Pessoa("Minguado",458.29103082, 987654321);
        System.out.println(g1.Apresentar());

        Aluno t2=new Aluno( "Pedro" , 457.67874, 934501892, 20269901);
        System.out.println(t2.Aprender());
        System.out.println(t2.Apresentar());
        t2.exibirJanela();
         
        Professor v3=new Professor("Ingrid", 132.98245, 907380462, 40412180, "Licenciatura");
        System.out.println(v3.Ensinar());
        System.out.println(v3.Apresentar());

        Funcionario y4=new Funcionario("Baixinho", 483.10982, 956789012, 101010, "Faxineiro");
        System.out.println(y4.Desempenhar());
        System.out.println(y4.Apresentar());

        Responsavel w5=new Responsavel("Rosana", 233.54678, 901678905);
        System.out.println(w5.Apresentar());
    }
}
