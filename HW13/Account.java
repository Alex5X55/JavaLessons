package HW13;

import java.util.Objects;

public class Account {
    private final int id;
    private long balance;
    private Currency currency;
    private String comment;

    public Account(int id, long balance, Currency currency, String comment) {
        if(balance < 0)
            throw new IllegalArgumentException("Баланс должен быть положительным");
        this.id = id;
        this.balance = balance;
        this.currency = currency;
        this.comment = comment;
    }

    public Account(int id, long balance, Currency currency) {
        this(id, balance, currency, "");
    }

    public Account(int id, long balance) {
        this(id, balance, Currency.RUBLES, "");
    }

    public Account(int id) {
        this(id, 0, Currency.RUBLES, "");
    }


    public int getId() {
        return id;
    }

     public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && currency == account.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currency);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", currency=" + currency +
                ", comment='" + comment + "'}\n";
    }
}
