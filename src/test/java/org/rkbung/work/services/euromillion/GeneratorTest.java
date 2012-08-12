package org.rkbung.work.services.euromillion;

import org.junit.Test;
import org.rkbung.work.domain.model.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * User: rkbung
 * Date: 12/08/12
 * Time: 19:12
 */
public class GeneratorTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(GeneratorTest.class);

    private Generator generator = new Generator();

    @Test
    public void testGetTicket() throws Exception {
        final Ticket ticket = generator.getTicket();
        assertThat(ticket, is(notNullValue()));
        final Set<Integer> numbers = ticket.getNumbers();
        final Set<Integer> stars = ticket.getStars();
        LOGGER.debug("numbers : {}", numbers);
        LOGGER.debug("stars : {}", stars);
        assertThat(numbers.size(), is(5));
        assertThat(stars.size(), is(2));
        for (Integer number : numbers) {
            assertThat(number >= 1, is(true));
            assertThat(number <= 50, is(true));
        }
        for (Integer star : stars) {
            assertThat(star >= 1, is(true));
            assertThat(star <= 50, is(true));
        }
    }
}
