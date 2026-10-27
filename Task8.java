import java.util.Scanner;

public class Task8{

    private static final int CORRECT_PIN = 1234;
    private static final int MAX_ATTEMPTS = 3;

    private double balance;

    public Task8(double initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.println("Deposited Amount: Rs. " + amount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn Amount: Rs. " + amount);
            checkBalance();
        }
    }

    public boolean authenticate(Scanner sc) {
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your 4-digit PIN: ");
            int pin = sc.nextInt();

            if (pin == CORRECT_PIN) {
                System.out.println("PIN verified successfully!");
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect PIN!");

                if (attempts < MAX_ATTEMPTS) {
                    System.out.println(
                        "Attempts remaining: "
                        + (MAX_ATTEMPTS - attempts)
                    );
                }
            }
        }

        System.out.println("Maximum PIN attempts exceeded.");
        return false;
    }

    public void showMenu(Scanner sc) {
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Task8 atm = new Task8(5000.00);

        System.out.println("Welcome to the ATM!");

        if (atm.authenticate(sc)) {
            atm.showMenu(sc);
        } else {
            System.out.println("Access denied. Please try again later.");
        }

        sc.close();
    }
}