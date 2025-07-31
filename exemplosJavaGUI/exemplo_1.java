import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class exemplo_1 {
    public static void main(String[] args) {
        JFrame myJFrame = new JFrame("Exemplo - Java Swing");
        myJFrame.setSize(500,300);

        JPanel myJPanel = new JPanel();
        myJPanel.setSize(300,300);

        myJPanel.setLayout(new GridBagLayout());

        JLabel myJLabel = new JLabel();
        myJLabel.setText("Diga-me sua opiniao sobre Java Swing: ");

        JTextArea miJTextArea = new JTextArea(5,20);
        
        myJPanel.add(myJLabel); myJPanel.add(miJTextArea);

        myJFrame.add(myJPanel);

        myJFrame.setVisible(true);
    }

    
}