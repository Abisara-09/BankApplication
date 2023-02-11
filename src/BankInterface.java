public interface BankInterface {

    int getBalance();
    String depositeMoney(int amount);
    String withdraw(int amount,String enteredPassword);
    double calculateInterest(int time);
}
