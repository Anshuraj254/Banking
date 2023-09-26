import java.util.Scanner;
public class BankingSystem 
{
    private static double balance = 1000.0; // Initial balance

    public static void banking() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Banking System!");
        int choice;

        do
        {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    System.out.println("Thank you for using the Simple Banking System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void checkBalance()
    {
        System.out.println("Your balance is: $" + balance);
    }

    private static void depositMoney() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: $");
        double depositAmount = scanner.nextDouble();

        if (depositAmount > 0)
        {
            balance += depositAmount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        } else 
        {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    private static void withdrawMoney()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > 0 && withdrawAmount <= balance)
        {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
        } else if (withdrawAmount > balance) 
        {
            System.out.println("Insufficient balance. Your current balance is: $" + balance);
        } else 
        {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }
}
