package org.rkbung.work.domain.model;

import java.util.HashSet;
import java.util.Set;

/**
 * User: rkbung
 * Date: 12/08/12
 * Time: 17:42
 */
public class Ticket extends BaseObject {
    private Set<Integer> numbers = new HashSet<>(5);

    private Set<Integer> stars = new HashSet<>(2);

    public Set<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    public Set<Integer> getStars() {
        return stars;
    }

    public void setStars(Set<Integer> stars) {
        this.stars = stars;
    }
}
