package account;

public class AccountLimit extends Account {
    private Double accountLimit;

    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }

    public AccountLimit(Double balance) {
        super(balance);
    }

    public void configAccountLimit() {
        this.accountLimit = this.getBalance() / 2;
    }

    @Override
    public void addBalance(Double ammount) {
        this.configAccountLimit();
        super.addBalance(ammount);
    }

    @Override
    public void drawBalance(Double ammount) {
        this.configAccountLimit();
        if (ammount < this.accountLimit) {
            super.drawBalance(ammount);
        } else {
            System.out.println("saldo insuficiente");
        }
    }
}
