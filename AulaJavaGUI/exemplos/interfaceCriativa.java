import java.awt.*;
import javax.swing.*;
public class interfaceCriativa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Seja bem-vindo(a) às previsões do seu futuro!");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(127, 0, 255)); 
        panel.setLayout(new BorderLayout());


        JButton botao = new JButton("DESCUBRA SEU FUTURO... =====AGORA=====");
        botao.setBackground(Color.WHITE);
        botao.setPreferredSize(new Dimension(100, 100));
        botao.setFont(new Font("Serif", Font.BOLD, 36));

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        formPanel.setOpaque(false); 
        JLabel label = new JLabel("Digite o número do mês do seu nascimento...");
        label.setFont(new Font("Serif", Font.BOLD, 36));
        label.setForeground(Color.WHITE);
        label.setBackground(new Color(255, 255, 255));
        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Serif", Font.BOLD, 36));

        formPanel.add(label);
        formPanel.add(textField);

        ImageIcon imagem = new ImageIcon("imagens/futuro.png"); // coloque a imagem na mesma pasta do código
        JLabel imagemLabel = new JLabel(imagem);
        imagemLabel.setHorizontalAlignment(JLabel.CENTER);
        imagemLabel.setVerticalAlignment(JLabel.CENTER);

        // Ação do botão
        botao.addActionListener(e -> {
            String entrada = textField.getText().trim();
            try {
                int mes = Integer.parseInt(entrada);
                String futuro;

                switch (mes) {
                    case 1:  futuro = "Um encontro inesperado mudará o rumo de algo que você nem sabia estar prestes a começar."; break;
                    case 2:  futuro = "Alguém do passado retornará — não para reatar, mas para revelar o que foi escondido."; break;
                    case 3:  futuro = "Antes que a última folha do outono caia, uma escolha sua abrirá um ciclo oculto."; break;
                    case 4:  futuro = "Você ouvirá uma frase comum... mas ela virá com um significado que mudará tudo."; break;
                    case 5:  futuro = "Um espelho mostrará mais do que sua imagem... mostrará um caminho esquecido."; break;
                    case 6:  futuro = "Quando o céu estiver mais cinza do que nunca, uma luz surgirá de onde você menos espera."; break;
                    case 7:  futuro = "Algo que você perdeu voltará... mas em outra forma, exigindo um novo olhar."; break;
                    case 8:  futuro = "Você encontrará um objeto antigo que carrega a resposta de uma pergunta ainda não feita."; break;
                    case 9:  futuro = "O vento tentará dizer algo enquanto você estiver de fones."; break;
                    case 10: futuro = "Um calafrio vai te atravessar, e não será o clima."; break;
                    case 11: futuro = "Uma borboleta vai te seguir por tempo demais para ser coincidência."; break;
                    case 12: futuro = "O café será oferecido por mãos misteriosas... aceite."; break;
                    default: futuro = "Mês inválido. Digite um número de 1 a 12."; break;
                }

                JOptionPane.showMessageDialog(null, futuro, "Sua mensagem é...", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um número válido (1 a 12).", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(imagemLabel, BorderLayout.CENTER); // imagem mística ao centro
        panel.add(botao, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
