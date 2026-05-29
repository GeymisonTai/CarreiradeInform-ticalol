import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainGUIJanela {

    public static void main(String[] args) {

        try {

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

            frame.add(panel);

            btnEnviar.addActionListener(e -> {

                try {

                    String nome = tfNome.getText().trim();
                    String cpf = tfCPF.getText().trim();
                    String telefone = tfTelefone.getText().trim();

                    if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty()) {
                        throw new Exception("Todos os campos devem ser preenchidos.");
                    }

                    if (!nome.matches("[a-zA-ZÀ-ÿ ]+")) {
                        throw new Exception("O nome deve conter apenas letras.");
                    }

                    if (!cpf.matches("\\d{11}")) {
                        throw new Exception("O CPF deve conter exatamente 11 números.");
                    }

                    if (!telefone.matches("\\d{9}")) {
                        throw new Exception("O telefone deve conter apenas 9 números.");
                    }

                    System.out.println("Nome: " + nome);
                    System.out.println("CPF: " + cpf);
                    System.out.println("Telefone: " + telefone);

                    exibirDados(nome, cpf, telefone);

                } catch (Exception ex) {

                    JOptionPane.showMessageDialog(
                            null,
                            ex.getMessage(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            });

            // Botão limpar
            btnLimpar.addActionListener(e -> {
                tfNome.setText("");
                tfCPF.setText("");
                tfTelefone.setText("");
            });

            frame.setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao iniciar o sistema: " + e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void exibirDados(String nome, String cpf, String telefone) {

        try {

            JFrame janelaResultado = new JFrame("Dados Enviados");
            janelaResultado.setSize(400, 200);
            janelaResultado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janelaResultado.setLocationRelativeTo(null);

            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(4, 1, 10, 10));

            JLabel titulo = new JLabel("Dados Recebidos:");
            JLabel lbNome = new JLabel("Nome: " + nome);
            JLabel lbCPF = new JLabel("CPF: " + cpf);
            JLabel lbTelefone = new JLabel("Telefone: " + telefone);

            painel.add(titulo);
            painel.add(lbNome);
            painel.add(lbCPF);
            painel.add(lbTelefone);

            janelaResultado.add(painel);
            janelaResultado.setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao exibir os dados.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
