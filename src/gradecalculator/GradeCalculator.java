/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradecalculator;

/**
 * GradeCalculator handles the core logic of validating and calculating grades
 * for Milestone 1, Milestone 2, and the Terminal Assessment.
 */
public class GradeCalculator {
    // Instance variables to hold grades for each component
    private int milestone1;
    private int milestone2;
    private int terminal;

    /**
     * Sets the grades for each component and validates that they are within
     * the allowed range:
     * - Milestone 1: 0–25
     * - Milestone 2: 0–40
     * - Terminal Assessment: 0–35
     *
     * @param m1 grade for Milestone 1
     * @param m2 grade for Milestone 2
     * @param t  grade for Terminal Assessment
     * @throws IllegalArgumentException if any grade is out of range
     */
    public void setGrades(int m1, int m2, int t) {
        // Validate Milestone 1
        if (m1 < 0 || m1 > 25) {
            throw new IllegalArgumentException("Milestone 1 must be between 0 and 25.");
        }

        // Validate Milestone 2
        if (m2 < 0 || m2 > 40) {
            throw new IllegalArgumentException("Milestone 2 must be between 0 and 40.");
        }

        // Validate Terminal Assessment
        if (t < 0 || t > 35) {
            throw new IllegalArgumentException("Terminal Assessment must be between 0 and 35.");
        }

        // Assign validated values to instance variables
        this.milestone1 = m1;
        this.milestone2 = m2;
        this.terminal = t;
    }

    /**
     * Calculates the total grade by summing all validated components.
     *
     * @return total grade out of 100
     */
    public int calculateTotal() {
        return milestone1 + milestone2 + terminal;
    }
}
