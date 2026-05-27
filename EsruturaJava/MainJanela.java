import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainJanela {
    public static void main(String[] args) {
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
        
        btnEnviar.addActionListener(e -> {
            System.out.println("Nome: " + tfNome.getText());
            System.out.println("CPF: " + tfCPF.getText());
            System.out.println("Telefone: " + tfTelefone.getText());
        });
        
        btnLimpar.addActionListener(e -> {
            tfNome.setText("");
            tfCPF.setText("");
            tfTelefone.setText("");
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
