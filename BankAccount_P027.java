package Assignment;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankAccount_P027 {
    private static double balance = 2000.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter withdraw amount: ");
        double amount = sc.nextDouble();

        try {
            withdraw(amount);
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + (amount - balance) + " Rs. to perform this transaction.");
        }
        balance -= amount;
    }
}
