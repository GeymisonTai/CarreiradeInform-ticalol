import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGUIJanela {
    public static void main(String[] args) {
       try{ 
        JFrame frame = new JFrame("Cadastro");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        
        JLabel labelNome = new JLabel("Nome:");
        JTextField tfNome = new JTextField();
        
        JLabel labelCPF = new JLabel("CPF:");
        JTextField tfCPF = new JTextField();
        
        JLabel labelTelefone = new JLabel("Telefone:");
        JTextField tfTelefone = new JTextField();
        
        JButton btnLimpar = new JButton("Limpar");
        JButton btnEnviar = new JButton("Enviar");

        
        panel.add(labelNome);
        panel.add(tfNome);
        panel.add(labelCPF);
        panel.add(tfCPF);
        panel.add(labelTelefone);
        panel.add(tfTelefone);
        panel.add(btnLimpar);
        panel.add(btnEnviar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        btnEnviar.addActionListener(e -> {
            String nome = tfNome.getText();
            String cpf = tfCPF.getText();
            String telefone = tfTelefone.getText();
            
            System.out.println("Nome: " + nome);
            System.out.println("CPF: " + cpf);
            System.out.println("Telefone: " + telefone);
            
            // Criar e exibir janela com os dados
            exibirDados(nome, cpf, telefone);
        });
        
        btnLimpar.addActionListener(e -> {
            tfNome.setText("");
            tfCPF.setText("");
            tfTelefone.setText("");
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
    public static void exibirDados(String nome, String cpf, String telefone) {
        JFrame janelaResultado = new JFrame("Dados Enviados");
        janelaResultado.setSize(400, 200);
        janelaResultado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaResultado.setLocationRelativeTo(null);
        
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 1, 10, 10));
        
        JLabel labelTitulo = new JLabel("Dados Recebidos:");
        JLabel labelNomeExibir = new JLabel("Nome: " + nome);
        JLabel labelCPFExibir = new JLabel("CPF: " + cpf);
        JLabel labelTelefoneExibir = new JLabel("Telefone: " + telefone);
        
        painel.add(labelTitulo);
        painel.add(labelNomeExibir);
        painel.add(labelCPFExibir);
        painel.add(labelTelefoneExibir);
        
        janelaResultado.add(painel);
        janelaResultado.setVisible(true);
    }
}
