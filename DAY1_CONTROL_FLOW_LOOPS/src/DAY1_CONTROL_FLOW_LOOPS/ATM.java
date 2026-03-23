package DAY1_CONTROL_FLOW_LOOPS;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 1000.0;
        int choice;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: $" + deposit);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient funds!");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawn: $" + withdraw);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
