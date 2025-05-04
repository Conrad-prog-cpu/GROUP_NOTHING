public class Main {
    public static void main(String[] args) {
        // Sample deduction values
        Deductions deductions = new Deductions(500.0, 300.0, 200.0, 1000.0);

        // Sample employee
        Employee employee = new Employee(1001, "Juan Dela Cruz", "1990-05-01", 150.0, 40.0, deductions);

        // Display
        System.out.println("=== EMPLOYEE INFORMATION ===");
        System.out.println(employee.getEmployeeInfo());

        System.out.println("\n=== SALARY DETAILS ===");
        System.out.printf("Gross Salary: PHP %.2f\n", employee.computeGrossSalary());
        System.out.println("Deductions:\n" + deductions.getDeductionsBreakdown());
        System.out.printf("Net Salary: PHP %.2f\n", employee.computeNetSalary());
    }
}
