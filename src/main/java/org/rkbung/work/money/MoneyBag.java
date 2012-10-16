package org.rkbung.work.money;

import java.util.ArrayList;
import java.util.List;

public class MoneyBag {
    private List<Money> monies = new ArrayList<>();

    MoneyBag(Money m1, Money m2) {
        appendMoney(m1);
        appendMoney(m2);
    }

    MoneyBag(Money bag[]) {
        for (int i = 0; i < bag.length; i++)
            appendMoney(bag[i]);
    }

    private void appendMoney(Money m) {
        if (monies.isEmpty()) {
            monies.add(m);
        } else {
            int i = 0;
            while ((i < monies.size())
                    && (!(monies.get(i).currency().equals(m.currency()))))
                i++;
            if (i >= monies.size()) {
                monies.add(m);
            } else {
                monies.set(i, new Money(monies.get(i).amount() +
                        m.amount(), m.currency()));
            }
        }
    }
}
