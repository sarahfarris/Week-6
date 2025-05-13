import java.util.ArrayList;
import java.util.List;

public class Main {
    List<BankAccount> checking = new ArrayList<>();
    List<BankAccount> savings = new ArrayList<>();
    List<BankAccount> retirement = new ArrayList<>();

    public static void main(String[] args){
        SavingsAccount.withdrawAmount(20);

    }
}
