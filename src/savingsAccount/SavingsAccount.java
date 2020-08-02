package savingsAccount;

//In the future dates should be added in methods as getDate(today) or something like that which i don't know yet.
//That way it would be much brighter and accurate

public class SavingsAccount {

    private static int standardAmount = 500;
    int balance;

    //Constructor
    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
        System.out.println (" ");
        System.out.println ("Initial balance for 19-07-2020 was " + balance + " PLN");
        System.out.println (" ");
    }

    //Check balance:
    public void checkBalance() {
        System.out.println (" ");
        System.out.println ("Today is " + java.time.LocalDate.now() + ". Your balance is " + balance);
    }

    //Deposit:
    public void deposit(int amountToDeposit, String date, String comment) {
        int afterDeposit = balance + amountToDeposit;
        balance = afterDeposit;
        System.out.println (date + " | Deposit: " + amountToDeposit + " PLN.");
        System.out.println ("Your balance increased to " + balance + " PLN | Comment: " + comment);
    }

    // Withdraw
    public int withdraw(int amountToWithdraw, String date, String comment) {
        int afterWithdraw = balance - amountToWithdraw;
        balance = afterWithdraw;
        System.out.println (date + " | Withdraw: " + amountToWithdraw + " PLN.");
        System.out.println ("Your balance decreased to " + balance + " PLN | Comment: " + comment);
        return amountToWithdraw;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount (23200);
        savings.withdraw (500, "28-07-2020", "additional buys");
//        savings.deposit(standardAmount, "01.08.2020", "+500 08.20");
//        savings.deposit(standardAmount, "01.09.2020", "+500 09.20");
//        savings.deposit(standardAmount, "01.10.2020", "+500 10.20");
//        savings.deposit(standardAmount, "01.11.2020", "+500 11.20");
//        savings.deposit(standardAmount, "01.12.2020", "+500 12.20");
        savings.checkBalance ();
    }
}