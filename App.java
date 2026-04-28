import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

//import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame{
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Welcome");
        mainFrame.setSize( 400,300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(3, 1, 10, 10));

        JPanel topPanel = new JPanel();
        JLabel lbFirstName = new JLabel("Enter your first name and age below:");
        topPanel.add(lbFirstName);
        mainFrame.add(topPanel);

        JPanel centralPanel = new JPanel();
        JTextField tfFirstName = new JTextField(10);
        centralPanel.add(tfFirstName);
        mainFrame.add(centralPanel);

        JTextField tfAge = new JTextField(10);
        centralPanel.add(tfAge);

        JPanel bottomPanel = new JPanel();
        JButton OkButton = new JButton("OK");
        bottomPanel.add(OkButton);
        mainFrame.add(bottomPanel);

        OkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText(); 
                lbFirstName.setText("Hello " + firstName);
                String sAge = tfFirstName.getText();
                try {
                    int age = Integer.parseInt(sAge); 
                }
                catch (Exception except) {
                    new JPopupMenu("Error");
                }
            }
            });

        mainFrame.setVisible(true);
    }
}
