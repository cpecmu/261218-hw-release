package cpecmu.cpe218.sp2020.hw3;

/**
 * An interface for a database of credit cards, that includes
 * an equivalence tester between any two cards
 * @author Chinawat
 *
 */
public interface CardEquivQuery {

    /**
     * Return the number of cards
     * @return the number of cards
     */
    int size();

    /**
     * Determine whether the two given cards are equivalent
     * @param c1 the first card number (between 0 and size()-1, inclusive)
     * @param c2 the second card number (between 0 and size()-1, inclusive)
     * @return {@true} if the two cards are equivalent,
     *          {@false} otherwise
     */
    boolean areEquivalent(int c1, int c2);

    /**
     * Return the number of queries issued to this equivalence tester.
     * @return the number of queries issued so far
     */
    int queryCount();
}
