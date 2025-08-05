import javax.swing.*;
import java.awt.*;

public class exercicioTela {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Painéis Laterais");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(212, 205, 230));
        panel1.setPreferredSize(new Dimension(250, 150)); // Lado esquerdo
        panel1.setLayout(new BorderLayout());


        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(189, 104, 220));
        panel2.setPreferredSize(new Dimension(250, 150)); // Lado direito
        panel2.setLayout(new BorderLayout());



        // as JLabel vão ficar todas no panel1
        JLabel texto1 = new JLabel("Juros ao mês %:");
        texto1.setFont(new Font("Serif", Font.BOLD, 12));
        


        // as JTextField vão ficar todas no panel2
       
        panel1.add(texto1, BorderLayout.WEST);
        frame.add(panel1, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
