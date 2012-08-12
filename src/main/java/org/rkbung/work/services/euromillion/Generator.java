package org.rkbung.work.services.euromillion;

import org.rkbung.work.domain.model.Ticket;

import java.util.*;

/**
 * User: rkbung
 * Date: 12/08/12
 * Time: 17:41
 */
public class Generator {
    private static final Random RANDOM = new Random();

    public Ticket getTicket() {
        Ticket ticket = new Ticket();
        ticket.setNumbers(getRandomNumbers());
        ticket.setStars(getRandomStars());
        return ticket;
    }

    private Set<Integer> getRandomStars() {
        Set<Integer> result = new TreeSet<>();
        while (result.size() < 2) {
            result.add(getRandom(1, 11));
        }
        return result;
    }

    private Set<Integer> getRandomNumbers() {
        Set<Integer> result = new TreeSet<>();
        while (result.size() < 5) {
            result.add(getRandom(1, 50));
        }
        return result;
    }

    private int getRandom(int inclusiveMin, int inclusiveMax) {
        return RANDOM.nextInt(inclusiveMax - inclusiveMin + 1) + 1;
    }
}
