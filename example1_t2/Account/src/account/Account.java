package account;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Account {
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private ArrayList<ItemDetail> historyDetails;

    public Account(Double balance) {
        this.balance = balance;
        this.historyDetails = new ArrayList<>();
    }

    public void addBalance(Double ammount) {
        this.balance += ammount;
        Calendar date = Calendar.getInstance();
        historyDetails.add(new ItemDetail(this.balance, date.getTime(), true));
    }

    public void drawBalance(Double ammount) {
        if (ammount < this.balance) {
            this.balance -= ammount;
            Calendar date = Calendar.getInstance();
            historyDetails.add(new ItemDetail(this.balance, date.getTime(), false));

        }
    }

    public void printBalance() {
        System.out.println("Your balance is " + this.balance);
    }

    public void printHistoryBalance() {
        for (ItemDetail item : this.historyDetails) {
            String type = item.getType() ? "+" : "-";
            System.out.println(type + "Balance " + item.getBalance() + " date " + item.getDate().getTime());
        }
    }
}
