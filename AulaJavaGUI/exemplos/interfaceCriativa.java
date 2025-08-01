import java.awt.*;
import javax.swing.*;

public class interfaceCriativa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Seja bem-vindo(a) as previsoes do seu futuro!");
        frame.setSize(1920,1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(993399 ));
        panel.setLayout(new BorderLayout());

        JButton botao = new JButton("DESCUBRA SEU FUTURO... =====AGORA=====");
        botao.setBackground(Color.WHITE);
        botao.setPreferredSize(new Dimension(100, 100));
        botao.setFont(new Font("Serif", Font.BOLD, 36));

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));


        JLabel label = new JLabel("Digite o numero do mes do seu nascimento...");
        label.setFont(new Font("Serif", Font.BOLD, 36));

        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Serif", Font.BOLD, 36));

        botao.addActionListener(e -> {
            String entrada = textField.getText().trim(); // captura o que o usuário digitou

        try {
            int mes = Integer.parseInt(entrada); // tenta converter para número inteiro
            String futuro; // variável que vai guardar o futuro retornado

            switch (mes) {
             case 1:
                futuro = "Um encontro inesperado mudara o rumo de algo que voce nem sabia estar prestes a começar."; // Janeiro
                break;
             case 2:
                futuro = "Alguem do passado retornara — nao para reatar, mas para revelar o que foi escondido"; // Fevereiro
                break;
                case 3:
                futuro = "Antes que a ultima folha do outono caia, uma escolha sua abrira um ciclo oculto"; // Março
                break;
             case 4:
                futuro = "Voce ouvira uma frase comum... mas ela vira com um significado que mudara tudo.";
                break;
             case 5:
                futuro = "Um espelho mostrara mais do que sua imagem — mostrara um caminho esquecido."; // Maio
                break;
             case 6:
                futuro = "Quando o ceu estiver mais cinza do que nunca, uma luz surgira de onde voce menos espera."; // Junho
                break;
             case 7:
                futuro = "Algo que voce perdeu voltara — mas em outra forma, exigindo um novo olhar."; // Julho
                break;
             case 8:
                futuro = "Voce encontrara um objeto antigo que carrega a resposta de uma pergunta ainda não feita."; // Agosto
                break;
             case 9:
                futuro = "O vento tentara dizer algo enquanto voce estiver de fones."; // Setembro
                break;
             case 10:
                futuro = "Um calafrio vai te atravessar, e nao sera o clima."; // Outubro
                break;
             case 11:
                futuro = "Uma borboleta vai te seguir por tempo demais para ser coincidencia."; // Novembro
                break;
             case 12:
                futuro = "O cafe sera oferecido por maos misteriosas — aceite."; // Dezembro
                break;
             default:
                futuro = "Mes invalido. Digite um numero de 1 a 12.";
                break;
        }

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, futuro, "Sua mensagem eh...", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Digite um numero válido (1 a 12).", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
    }
});

        formPanel.add(label);
        formPanel.add(textField);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(botao, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
