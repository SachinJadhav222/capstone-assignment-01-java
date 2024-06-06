import java.util.Scanner;

public class IT_Calculator {
    // Variables to store income and tax values
    private double TaxableIncome;
    private double TaxPaidPerYear;
    private double TaxPayablePerMonth;

    // Method to read the taxable income
    public void readTaxableIncome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your taxable income: ");
        TaxableIncome = scanner.nextDouble();
    }

    // Method to calculate and print the tax paid per year
    public void calculateTax() {
        if (TaxableIncome <= 25000) {
            TaxPaidPerYear = 0;
        } else if (TaxableIncome > 25000 && TaxableIncome <= 50000) {
            TaxPaidPerYear = (TaxableIncome - 25000) * 0.10;
        } else if (TaxableIncome > 50000 && TaxableIncome <= 75000) {
            TaxPaidPerYear = (25000 * 0.10) + (TaxableIncome - 50000) * 0.20;
        } else {
            TaxPaidPerYear = (25000 * 0.10) + (25000 * 0.20) + (TaxableIncome - 75000) * 0.30;
        }
        TaxPayablePerMonth = TaxPaidPerYear / 12;
    }

    // Method to print the tax details
    public void printTaxDetails() {
        System.out.printf("Total tax paid in a year: $%.2f%n", TaxPaidPerYear);
        System.out.printf("Tax payable per month: $%.2f%n", TaxPayablePerMonth);
    }

    public static void main(String[] args) {
        // Creating an object of IT_Calculator
        IT_Calculator calculator = new IT_Calculator();
        
        // Reading the taxable income
        calculator.readTaxableIncome();
        
        // Calculating the tax
        calculator.calculateTax();
        
        // Printing the tax details
        calculator.printTaxDetails();
    }
}
