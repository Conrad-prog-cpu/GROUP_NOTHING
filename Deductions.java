public class Deductions {
    private double sss;
    private double philHealth;
    private double pagIbig;
    private double withholdingTax;

    public Deductions(double sss, double philHealth, double pagIbig, double withholdingTax) {
        this.sss = sss;
        this.philHealth = philHealth;
        this.pagIbig = pagIbig;
        this.withholdingTax = withholdingTax;
    }

    public double totalDeductions() {
        return sss + philHealth + pagIbig + withholdingTax;
    }

    public String getDeductionsBreakdown() {
        return "SSS: " + sss + "\n"
             + "PhilHealth: " + philHealth + "\n"
             + "Pag-IBIG: " + pagIbig + "\n"
             + "Withholding Tax: " + withholdingTax;
    }
}
