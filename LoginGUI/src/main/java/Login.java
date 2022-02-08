
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login {
        
    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        
        JFrame frame = new JFrame();
        frame.setSize(300,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);                        
        
        panel.setLayout(null);
        
        JLabel label = new JLabel("Username");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        
        frame.setVisible(true);
        
        
    }
     
    
}
