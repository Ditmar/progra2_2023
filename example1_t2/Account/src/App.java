import account.Account;
import account.AccountLimit;

public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account(100.0);
        account.addBalance(50.0);
        account.addBalance(150.0);
        account.drawBalance(100.0);
        account.printHistoryBalance();
        AccountLimit accountLimit = new AccountLimit(400.0);
        accountLimit.addBalance(1000.0);
        accountLimit.addBalance(4552.0);
        accountLimit.drawBalance(600.0);
        accountLimit.drawBalance(3000.0);
        accountLimit.printHistoryBalance();
        accountLimit.printBalance();
    }
}
