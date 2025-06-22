import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculatorGUI extends JFrame implements ActionListener {
    JTextField nameField, mathField, sciField, engField, ssField, compField;
    JButton calculateButton;

    public GradeCalculatorGUI() {
        setTitle("Student Grade Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2, 10, 10));

        // Labels and text fields
        add(new JLabel("Student Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Math Marks:"));
        mathField = new JTextField();
        add(mathField);

        add(new JLabel("Science Marks:"));
        sciField = new JTextField();
        add(sciField);

        add(new JLabel("English Marks:"));
        engField = new JTextField();
        add(engField);

        add(new JLabel("Social Studies Marks:"));
        ssField = new JTextField();
        add(ssField);

        add(new JLabel("Computer Marks:"));
        compField = new JTextField();
        add(compField);

        calculateButton = new JButton("Calculate Grade");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Empty placeholder
        add(new JLabel());

        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String name = nameField.getText().trim();
            int math = Integer.parseInt(mathField.getText().trim());
            int sci = Integer.parseInt(sciField.getText().trim());
            int eng = Integer.parseInt(engField.getText().trim());
            int ss = Integer.parseInt(ssField.getText().trim());
            int comp = Integer.parseInt(compField.getText().trim());

            // Validate marks
            if (math < 0 || sci < 0 || eng < 0 || ss < 0 || comp < 0 ||
                    math > 100 || sci > 100 || eng > 100 || ss > 100 || comp > 100) {
                JOptionPane.showMessageDialog(this, "Please enter valid marks (0-100).");
                return;
            }

            int total = math + sci + eng + ss + comp;
            double percentage = total / 5.0;
            String grade;

            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else grade = "F (Fail)";

            String message = "Name: " + name + "\n"
                    + "Total: " + total + "/500\n"
                    + String.format("Percentage: %.2f%%\n", percentage)
                    + "Grade: " + grade;

            JOptionPane.showMessageDialog(this, message, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter numeric marks only.");
        }
    }

    public static void main(String[] args) {
        new GradeCalculatorGUI();
    }
}
