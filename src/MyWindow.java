import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public JLabel heading;
    Font font = new Font("", Font.BOLD, 30);

    public JPanel mainPanel;
    public JLabel nameLabel, passwordLabel;
    public JTextField nameTextField;
    public JPasswordField passwordField;
    public JButton button1, button2;
    public MyWindow()
    {
        super.setTitle("Form");
        super.setSize(500,500);
        super.setLocation(100,100);

        // terminate program when window is closed
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        setVisible(true);
        System.out.println("This is constructor");
    }

    public void createGUI()
    {
        // border layout
        this.setLayout(new BorderLayout());

        heading=new JLabel("My Form...");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);

        this.add(heading, BorderLayout.NORTH);

        //creating working with JPanel
        mainPanel = new JPanel();
        // setting layout of main panel
        mainPanel.setLayout(new GridLayout(3, 2));

        nameLabel = new JLabel("Enter Name :");
        nameLabel.setFont(font);

        passwordLabel = new JLabel("Enter password :");
        passwordLabel.setFont(font);

        nameTextField= new JTextField();
        nameTextField.setFont(font);

        passwordField = new JPasswordField();
        passwordField.setFont(font);

        button1 = new JButton("Submit");
        button1.setFont(font);

        button2 = new JButton("Reset");
        button2.setFont(font);

        // add the components to panel
        mainPanel.add(nameLabel);
        mainPanel.add(nameTextField);

        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);

        mainPanel.add(button1);
        mainPanel.add(button2);

        this.add(mainPanel, BorderLayout.CENTER);
    }
}
