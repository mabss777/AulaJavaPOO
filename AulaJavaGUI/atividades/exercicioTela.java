import javax.swing.*;

import javafx.scene.layout.Border;

import java.awt.*;

public class exercicioTela {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Painéis Laterais");
        frame.setSize(650, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(212, 205, 230));
        panel1.setPreferredSize(new Dimension(300, 200)); // Lado esquerdo
        panel1.setLayout(new BorderLayout());


        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(189, 104, 220));
        panel2.setPreferredSize(new Dimension(400, 200)); // Lado direito
        panel2.setLayout(new BorderLayout());



        // as JLabel vão ficar todas no panel1
        JLabel texto1 = new JLabel("Juros ao mês %:");
        texto1.setFont(new Font("Serif", Font.BOLD, 25));

        JLabel texto2 = new JLabel("Num. de anos:");
        texto1.setFont(new Font("Serif", Font.BOLD, 25));

        JLabel texto3 = new JLabel("Depósito mensal R$:");
        texto1.setFont(new Font("Serif", Font.BOLD, 25));

        JLabel texto4 = new JLabel("Total Poupado R$:");
        texto1.setFont(new Font("Serif", Font.BOLD, 25));
        


        // as JTextField vão ficar todas no panel2
       JTextField caixa1 = new JTextField();
       caixa1.setFont(new Font("Serif", Font.ITALIC, 25));


       panel1.add(texto4, BorderLayout.SOUTH);
       panel1.add(texto3, BorderLayout.EAST);
       panel1.add(texto2, BorderLayout.WEST);
        panel1.add(texto1, BorderLayout.NORTH);
        panel2.add(caixa1, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
