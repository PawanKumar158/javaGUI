import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(400, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Add panel to the frame
        frame.add(panel);
        placeComponents(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // Set the layout of the panel
        panel.setLayout(null);

        // Create a label
        JLabel userLabel = new JLabel("Name:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Create a text field for user input
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Create a button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 80, 80, 25);
        panel.add(loginButton);

        // Create an action listener for the button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action to be performed when button is clicked
                String username = userText.getText();
                JOptionPane.showMessageDialog(null, "Hello, " + username);
            }
        });
    }
}
