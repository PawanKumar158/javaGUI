import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateCalculatorGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Date Calculator");
        frame.setSize(400, 200);
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

        // Create a label for days input
        JLabel daysLabel = new JLabel("Enter number of days:");
        daysLabel.setBounds(10, 20, 150, 25);
        panel.add(daysLabel);

        // Create a text field for days input
        JTextField daysText = new JTextField(20);
        daysText.setBounds(170, 20, 165, 25);
        panel.add(daysText);

        // Create a label for the result
        JLabel resultLabel = new JLabel("New Date:");
        resultLabel.setBounds(10, 50, 150, 25);
        panel.add(resultLabel);

        // Create a text field to display the result
        JTextField resultText = new JTextField(20);
        resultText.setBounds(170, 50, 165, 25);
        resultText.setEditable(false);
        panel.add(resultText);

        // Create a button to calculate the date
        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 80, 150, 25);
        panel.add(calculateButton);

        // Create an action listener for the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int days = Integer.parseInt(daysText.getText());
                    LocalDate currentDate = LocalDate.now();
                    LocalDate newDate = currentDate.plusDays(days);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    resultText.setText(newDate.format(formatter));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });
    }
}
