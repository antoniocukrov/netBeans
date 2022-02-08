
package button;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lord Pupcent
 */
public class GUI implements ActionListener {
    private int count = 0;
    private final JLabel label;
    private final JFrame frame;
    private final JPanel panel;
    private final JButton button;
    
    public GUI() {
        frame = new JFrame();
        
        button = new JButton("Click me");
        button.addActionListener(this);
        
        label = new JLabel("Number of clicks:0 ");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,50,10,50));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);   
    } 
    
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       count++;
       label.setText("Number of clicks: " + count);
    }
    
    
    
}
