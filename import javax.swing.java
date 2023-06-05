import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankingInterface extends JFrame {
    private JTextField accountNumberTextField;
    private JPasswordField pinTextField;
    private JButton loginButton;

    public BankingInterface() {
        // Set up the frame
        setTitle("Banking Interface");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        JLabel accountNumberLabel = new JLabel("Account Number:");
        accountNumberTextField = new JTextField(15);
        JLabel pinLabel = new JLabel("PIN:");
        pinTextField = new JPasswordField(15);
        loginButton = new JButton("Login");

        // Add components to the frame
        add(accountNumberLabel);
        add(accountNumberTextField);
        add(pinLabel);
        add(pinTextField);
        add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountNumber = accountNumberTextField.getText();
                char[] pinChars = pinTextField.getPassword();
                String pin = new String(pinChars);

                // Perform login logic here
                // Example: Validate account number and PIN, and proceed to the main banking interface
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BankingInterface().setVisible(true);
            }
        });
    }
}
