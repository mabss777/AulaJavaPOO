import javax.swing.*;

import java.awt.*;
import java.util.Scanner;
public class exercicioTela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        JFrame frame = new JFrame("Painéis Laterais");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(212, 205, 230));
        panel1.setPreferredSize(new Dimension(225, 125)); // Lado esquerdo
        panel1.setLayout(null);


        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(212, 205, 230));
        panel2.setPreferredSize(new Dimension(225, 125)); // Lado direito
        panel2.setLayout(null);


        // as JLabel vão ficar todas no panel1
       JLabel texto1 = new JLabel("Juros ao mês %:"); 
       texto1.setBounds(0, 1, 200, 50);
        texto1.setFont(new Font("Serif", Font.BOLD, 12));
        

        JLabel texto2 = new JLabel("Num. de anos:");
        texto2.setFont(new Font("Serif", Font.BOLD, 12));
        texto2.setBounds(0, 41, 200, 50);        

        JLabel texto3 = new JLabel("Depósito mensal R$:");
        texto3.setFont(new Font("Serif", Font.BOLD, 12));
        texto3.setBounds(0, 81, 200, 50);
        

        JLabel texto4 = new JLabel("Total Poupado R$:");
        texto4.setFont(new Font("Serif", Font.BOLD, 12));
        texto4.setBounds(0, 121, 200, 50);
        
        // as JTextField vão ficar todas no panel2
       JTextField caixa1 = new JTextField();
       caixa1.setFont(new Font("Serif", Font.ITALIC, 20));
       caixa1.setBounds(0, 5, 200, 35);

       JTextField caixa2 = new JTextField();
       caixa2.setFont(new Font("Serif", Font.ITALIC, 20));
       caixa2.setBounds(0, 45, 200, 35);

       JTextField caixa3 = new JTextField();
       caixa3.setFont(new Font("Serif", Font.ITALIC, 20));
       caixa3.setBounds(0, 85, 200, 35);

       JLabel resultadoCalculo = new JLabel();
       resultadoCalculo.setFont(new Font("Serif", Font.ITALIC, 20));
       resultadoCalculo.setBounds(0, 125, 200, 35);

       JButton botaoOk = new JButton("OK");
       botaoOk.setBackground(Color.WHITE);
       botaoOk.setBounds(0, 160, 200, 25);



       // ========= CALCULOS =========
       
       botaoOk.addActionListener(e -> {
    try {
        double jurosMensal = Double.parseDouble(caixa1.getText()) / 100.0;
        int anos = Integer.parseInt(caixa2.getText());
        int meses = anos * 12;
        double depositoMensal = Double.parseDouble(caixa3.getText());

        double totalPoupado;

        if (jurosMensal == 0) {
            totalPoupado = depositoMensal * meses;
        } else {
            totalPoupado = depositoMensal * (Math.pow(1 + jurosMensal, meses) - 1) / jurosMensal;
        }

        resultadoCalculo.setText(String.format("R$ %.2f", totalPoupado));
    } catch (NumberFormatException ex) {
        resultadoCalculo.setText("Erro nos dados");
    }
});
       


      
       panel1.add(texto4);
       panel1.add(texto3);
       panel1.add(texto2);
       panel1.add(texto1);
       
       panel2.add(resultadoCalculo);
       panel2.add(botaoOk);
       panel2.add(caixa3);
       panel2.add(caixa2);
       panel2.add(caixa1);
       
       frame.add(panel1, BorderLayout.WEST);
       frame.add(panel2, BorderLayout.EAST);
       frame.setVisible(true);

       scanner.close();
    }
}