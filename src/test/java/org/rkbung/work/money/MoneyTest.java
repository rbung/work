package org.rkbung.work.money;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class MoneyTest {
    private Money m12CHF;

    private Money m14CHF;

    @Before
    public void setUp() throws Exception {
        m12CHF = new Money(12, "CHF");
        m14CHF = new Money(14, "CHF");
    }

    @Test
    public void testSimpleAdd() {
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF);
        assertThat(result, is(expected));
    }

    @Test
    public void testEquals() {
        assertThat(m12CHF, is(notNullValue()));
        assertThat(m12CHF, is(m12CHF));
        assertThat(m12CHF, is(new Money(12, "CHF")));
        assertThat(m12CHF, not((m14CHF)));
    }
}
