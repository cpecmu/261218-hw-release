package cpecmu.cpe218.sp2019.hw6;

import java.util.Set;

import cpecmu.cpe218.sp2019.Triple;

/**
 *
 * @author Chinawat
 *
 * @param <F> type of friends
 */
public interface DebtReconciliation<F> {

    /**
     * Compute a consistent reconcilation for the given amounts of money owed
     * between friends.
     * @param owed a set of triples (i, j, amt), indicating that person i
     *          owes person j for the amount of amt > 0.
     *          Requires that if (i, j, _) appears in {@code owed}, then
     *          (j, i, _) does not appear in {@code owed}.
     * @return a set of triples (i, j, r), indicating that person i
     *          should pay person j for the total amount of r > 0.
     *          The number of triples should be less than the number of persons
     *          involved.
     */
    Set<Triple<F, F, Integer>> reconciliation(Set<Triple<F, F, Integer>> owed);
}
