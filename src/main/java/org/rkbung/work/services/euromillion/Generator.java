package org.rkbung.work.services.euromillion;

import org.rkbung.work.domain.model.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * User: rkbung
 * Date: 12/08/12
 * Time: 17:41
 */
public class Generator {
    private static final Logger LOGGER = LoggerFactory.getLogger(Generator.class);

    private static final Random RANDOM = new Random();

    public static final int INCLUSIVE_STARS_MIN = 1;

    public static final int INCLUSIVE_STARS_MAX = 11;

    public static final int INCLUSIVE_NUMBERS_MIN = 1;

    public static final int INCLUSIVE_NUMBERS_MAX = 50;

    public Ticket getTicket() {
        Ticket ticket = new Ticket();
        ticket.setNumbers(getRandomNumbers());
        ticket.setStars(getRandomStars());
        LOGGER.debug("Ticket : {}", ticket);
        return ticket;
    }

    private Set<Integer> getRandomStars() {
        Set<Integer> result = new TreeSet<>();
        while (result.size() < 2) {
            result.add(getRandom(INCLUSIVE_STARS_MIN, INCLUSIVE_STARS_MAX));
        }
        return result;
    }

    private Set<Integer> getRandomNumbers() {
        Set<Integer> result = new TreeSet<>();
        while (result.size() < 5) {
            result.add(getRandom(INCLUSIVE_NUMBERS_MIN, INCLUSIVE_NUMBERS_MAX));
        }
        return result;
    }

    private int getRandom(int inclusiveMin, int inclusiveMax) {
        return RANDOM.nextInt(inclusiveMax - inclusiveMin + 1) + 1;
    }
}
