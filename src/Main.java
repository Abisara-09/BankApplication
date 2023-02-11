import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount abiAcc = new SBIAccount(name,balance,password);
        System.out.println("your account has been credited with account number: "+abiAcc.getAccountNo());

        //getBalance
        System.out.println("your current balance is: "+abiAcc.getBalance());

        // deposit
        System.out.println(abiAcc.depositeMoney(500));
        System.out.println("new balance is "+abiAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdraw:");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();

     System.out.println(abiAcc.withdraw(amount,enteredPassword));
     System.out.println("Current balance is "+abiAcc.getBalance());

        //interest
        System.out.println("Interest for 4 years on current balance "+abiAcc.getBalance()+" is "+abiAcc.calculateInterest(4));
    }
}