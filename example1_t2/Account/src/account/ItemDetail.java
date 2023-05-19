package account;

import java.util.Calendar;
import java.util.Date;

public class ItemDetail {
    private Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Boolean type;

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public ItemDetail(Double balance, Date date2, Boolean type) {
        this.balance = balance;
        this.date = date2;
        this.type = type;
    }
}
