/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradecalculator;

import javax.swing.*;

/**
 * GradeCalculatorGUI is the main GUI class that allows the user to input grades
 * for Milestone 1, Milestone 2, and Terminal Assessment, then calculates the total.
 */
public class GradeCalculatorGUI extends JFrame {
    // GUI components
    private JTextField txtM1, txtM2, txtTA;
    private JLabel lblResult;

    /**
     * Constructor: sets up the GUI window and its components.
     */
    public GradeCalculatorGUI() {
        // Set the window title, size, close operation, and layout manager
        setTitle("Grade Calculator");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // Using absolute positioning

        // Label and input for Milestone 1
        JLabel lbl1 = new JLabel("Milestone 1 (Max 25):");
        lbl1.setBounds(20, 20, 150, 25);
        add(lbl1);

        txtM1 = new JTextField();
        txtM1.setBounds(180, 20, 120, 25);
        add(txtM1);

        // Label and input for Milestone 2
        JLabel lbl2 = new JLabel("Milestone 2 (Max 40):");
        lbl2.setBounds(20, 60, 150, 25);
        add(lbl2);

        txtM2 = new JTextField();
        txtM2.setBounds(180, 60, 120, 25);
        add(txtM2);

        // Label and input for Terminal Assessment
        JLabel lbl3 = new JLabel("Terminal Assessment (Max 35):");
        lbl3.setBounds(20, 100, 210, 25);
        add(lbl3);

        txtTA = new JTextField();
        txtTA.setBounds(230, 100, 70, 25);
        add(txtTA);

        // Compute button
        JButton btnCompute = new JButton("Compute Grade");
        btnCompute.setBounds(100, 140, 150, 30);
        add(btnCompute);

        // Result label
        lblResult = new JLabel("Total Grade: ");
        lblResult.setBounds(20, 180, 300, 25);
        add(lblResult);

        // Action listener for the button
        btnCompute.addActionListener(e -> computeGrade());
    }

    /**
     * computeGrade() - gets the values from input fields, validates them,
     * and uses GradeCalculator to compute the total grade.
     */
    private void computeGrade() {
        try {
            // Parse inputs from text fields
            int m1 = Integer.parseInt(txtM1.getText());
            int m2 = Integer.parseInt(txtM2.getText());
            int ta = Integer.parseInt(txtTA.getText());

            // Use GradeCalculator logic
            GradeCalculator gc = new GradeCalculator();
            gc.setGrades(m1, m2, ta);

            // Compute total and display it
            int total = gc.calculateTotal();
            lblResult.setText("Total Grade: " + total + "/100");

        } catch (NumberFormatException e) {
            // If user enters non-numeric values
            JOptionPane.showMessageDialog(this, "Please enter numeric values only.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            // If user enters values outside valid grade ranges
            JOptionPane.showMessageDialog(this, e.getMessage(),
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * main() - Entry point of the application.It launches the GUI.
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GradeCalculatorGUI().setVisible(true);
        });
    }
}

