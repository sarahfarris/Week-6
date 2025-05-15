import java.util.Scanner;

public class BankAccount {
  String accountHolder;
  double balance;

  Scanner scanner = new Scanner(System.in);

  public BankAccount(double balance, String accountHolder) {
    this.balance = balance;
    this.accountHolder = accountHolder;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double depositAmount(double amount) {
    balance += amount;
    return amount;
  }

  public double withdrawAmount(double amount) {
    balance -= amount;
    return amount;
  }
}
