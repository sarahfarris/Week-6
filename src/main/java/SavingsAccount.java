public class SavingsAccount extends BankAccount {
  double interest;

  public SavingsAccount(double balance, String accountHolder, double interest) {
    super(balance, accountHolder);
    this.interest = interest;
  }

  public double getInterest() {
    return interest;
  }

  public void setInterest(double interest) {
    this.interest = interest;
  }

   //overriding deposit to apply interest to new balance
  public void applyInterest() {
    balance += balance * interest;
    System.out.println("Balance with interest: " + balance);
  }

  @Override
  public static double withdrawAmount(double amount) {
    double minBalance = 5;
    if (balance > minBalance) {
      balance = balance - amount;
      CheckingAccount.applyTransactionFees(amount);
    } else {
      System.out.println("Insufficient funds");
    }
    return balance;
  }
}
