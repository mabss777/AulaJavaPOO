import java.awt.*;
import javax.swing.*;
 
public class meuApp{
 
    public static void main(String[] args){
 
        JFrame frame = new JFrame("Meu Horóscopo...");
        frame.setSize(1100, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fechar tela
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setSize(1920, 1080);
        panel.setBackground(Color.yellow);
        panel.setLayout(new BorderLayout());
        frame.add(panel);

        JLabel label = new JLabel("Digite o seu signo: ");
        label.setFont(new Font("Serif", Font.BOLD, 30));
        label.setBounds(400, 300, 400, 50);
        panel.add(label);
 
        JTextField textField = new JTextField();
        textField.setFont(new Font("Serif", Font.BOLD, 30));
        textField.setBounds(50, 60, 280, 30);
        panel.add(textField);
 
       
 
       
        ImageIcon imagem = new ImageIcon("futuro.png"); // coloque a imagem na mesma pasta do código
        JLabel imagemLabel = new JLabel(imagem);
        imagemLabel.setSize(500, 500);
        imagemLabel.setHorizontalAlignment(JLabel.CENTER);
        imagemLabel.setVerticalAlignment(JLabel.CENTER);
        panel.add(imagemLabel, BorderLayout.CENTER);
 
        JButton button = new JButton("Ver mensagem");
        button.setBounds(500, 400, 150, 50);
        button.setBackground(Color.red);//botao
        button.setForeground(Color.YELLOW);//tela
        panel.add(button);
       
        button.addActionListener(e -> {
           String signo = textField.getText().toLowerCase().trim();
           String mensagem;
 
           switch (signo) {
            case "áries":
                mensagem = "aries: Sua coragem inspira todos ao seu redor. Vá em frente com confiança!";
                break;
            case "touro":
                mensagem = "Touro: Sua estabilidade e lealdade tornam o mundo mais seguro.";
                break;
            case "gêmeos":
            case "gemeos":
                mensagem = "Gêmeos: Sua mente ágil encanta e diverte todos ao seu redor!";
                break;
            case "câncer":
            case "cancer":
                mensagem = "Câncer: Sua empatia é um presente valioso para o mundo.";
                break;
            case "leão":
            case "leao":
                mensagem = "Leão: Seu brilho e generosidade iluminam qualquer ambiente.";
                break;
            case "virgem":
                mensagem = "Virgem: Sua atenção aos detalhes torna tudo mais especial.";
                break;
            case "libra":
                mensagem = "Libra: Sua busca por equilíbrio traz paz e harmonia.";
                break;
            case "escorpião":
            case "escorpiao":
               mensagem = "Escorpião: Sua intensidade e lealdade são admiráveis.";
                break;
            case "sagitário":
            case "sagitario":
                mensagem = "Sagitário: Seu entusiasmo e espírito livre contagiam a todos!";
                break;
            case "capricórnio":
            case "capricornio":
                mensagem = "Capricórnio: Sua disciplina e persistência são inspirações reais.";
                break;
            case "aquário":
            case "aquario":
                mensagem = "Aquário: Sua criatividade e visão transformam o mundo.";
                break;
            case "peixes":
               mensagem = "Peixes: Sua sensibilidade e imaginação tocam os corações.";
                break;
            default:
                mensagem = "Signo não reconhecido. Verifique a grafia e tente novamente.";
                break;
        }
 
        JOptionPane.showMessageDialog(frame, mensagem, "Seu Horóscopo", JOptionPane.INFORMATION_MESSAGE);
 
 
        });
   
 
 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
 
    }
 
}