import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*;

public class primeiroApp {
    public static void main(String[] args) {
        System.out.println("Hello GUI World!");

        JFrame frame = new JFrame("Minha primeira janela!");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("Clique Aqui!!!");
        button.setBackground(Color.WHITE);
        button.setPreferredSize(new Dimension(100, 100));
         JButton button2 = new JButton("Vai, Clica Aqui!!!");
        button2.setBackground(Color.LIGHT_GRAY);
        button2.setPreferredSize(new Dimension(150,150));

        

        JLabel label = new JLabel("Digite seu nome!");
        label.setFont(new Font("Serif", Font.BOLD, 36));

        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Serif", Font.BOLD, 36));

        button.addActionListener(e -> {
                    JOptionPane.showMessageDialog(null, textField.getText(), "Lerolerolerolero", 2);
        });

        JTextArea textArea = new JTextArea("Hoje esta um dia frio e ensolarado!");
        JTextArea textArea2 = new JTextArea("Hoje esta um dia frio!");

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        formPanel.add(label);
        formPanel.add(textField);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add( textArea2, BorderLayout.WEST);
        panel.add( textArea, BorderLayout.EAST);
        panel.add(button, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
       
    }
    
}
