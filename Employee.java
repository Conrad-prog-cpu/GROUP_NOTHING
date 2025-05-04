public class Employee {
    private int employeeNumber;
    private String name;
    private String birthday;
    private double hourlyRate;
    private double hoursWorked;
    private Deductions deductions;

    public Employee(int employeeNumber, String name, String birthday, double hourlyRate, double hoursWorked, Deductions deductions) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.birthday = birthday;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.deductions = deductions;
    }

    public String getEmployeeInfo() {
        return "Employee Number: " + employeeNumber + "\n"
             + "Name: " + name + "\n"
             + "Birthday: " + birthday;
    }

    public double computeGrossSalary() {
        return hourlyRate * hoursWorked;
    }

    public double computeNetSalary() {
        return computeGrossSalary() - deductions.totalDeductions();
    }
}
