package org.rkbung.work.money;

public class Money {
    private int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int amount() {
        return amount;
    }

    public String currency() {
        return currency;
    }

    public Money add(Money m) {
        return new Money(amount() + m.amount(), currency());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != money.amount) return false;
        if (!currency.equals(money.currency)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + currency.hashCode();
        return result;
    }
}
