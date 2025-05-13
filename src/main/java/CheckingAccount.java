public class CheckingAccount extends BankAccount {
  static double transactionsFees;

  public CheckingAccount(double balance, String accountHolder, double transactionsFees) {
    super(balance, accountHolder);
    this.transactionsFees = transactionsFees;
  }

  public double getTransactionsFees() {
    return transactionsFees;
  }

  public void setTransactionsFees(double transactionsFees) {
    this.transactionsFees = transactionsFees;
  }


  public static void applyTransactionFees(double balance) {
    transactionsFees = 3.99;
    balance = balance - transactionsFees;
  }

  @Override
  public double withdrawAmount(double amount) {
    balance = balance - amount;
    applyTransactionFees(balance);
    return amount;
  }



}
