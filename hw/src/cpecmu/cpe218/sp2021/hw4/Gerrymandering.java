package cpecmu.cpe218.sp2021.hw4;

import java.util.Set;

public interface Gerrymandering {

    /**
     * Return the number of voters in each precinct.
     * @return the number of voters in each precinct
     */
    int precinctSize();

    /**
     * Return the array containing the number of party A's voters in each
     * precinct.  The number of precincts is guaranteed to be even.
     * The number of party B's voters in each precinct can be computed from
     * the precinct size, minus the number of party A's voters.
     * @return the array containing the number of party A's voters in each
     *          precinct.
     */
    int[] partyAvoters();

    /**
     * Return whether the given set of precincts is susceptible to
     * gerrymandering.
     * @return {@code true} if it is possible to partition the precincts into
     *          two districts containing the same number of precincts, such
     *          that one of the parties will win both districts;
     *          {@code false} otherwise
     */
    boolean isSusceptible();

    /**
     * Return the set of precincts for one district that will make one party
     * with both districts (optional).
     * This method should only be called after {@link #isSusceptible()}.
     * @return the set of one district's precincts that demonstrates the
     *          possibility of gerrymandering, or {@code null} if the set of
     *          precincts is not susceptible to gerrymandering
     */
    Set<Integer> districtPrecincts();
}
