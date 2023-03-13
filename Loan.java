import java.util.Scanner;

public class LoanAmountShortForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loan amount in numbers: ");
        long loanAmount = scanner.nextLong();
        System.out.println("Loan amount in short form: " + convertToShortForm(loanAmount));
        scanner.close();
    }

    public static String convertToShortForm(long loanAmount) {
        if (loanAmount < 0) {
            return "Invalid Input";
        } else if (loanAmount < 1000) {
            return String.valueOf(loanAmount);
        } else if (loanAmount < 1_00_000) {
            return String.format("%.2fK", loanAmount / 1000.0);
        } else if (loanAmount < 1_00_00_000) {
            return String.format("%.2fL", loanAmount / 1_00_000.0);
        } else {
            return String.format("%.2fCr", loanAmount / 1_00_00_000.0);
        }
    }
}
