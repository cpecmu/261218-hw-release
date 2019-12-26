package cpecmu.cpe218.sp2020.hw6;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Chinawat
 *
 * @param <T> type of TAs
 * @param <S> type of office hours slots
 */
public interface OfficeHours<T, S> {

    /**
     * Construct an office hours schedule from the given constraints, or
     * report that no schedule is feasible.
     * @param slots a set of possible time slots
     * @param available a map from each TA to a set of slots for which the TA
     *          can hold office hours
     * @param a the lower bound of the slots each TA must hold
     * @param b the upper bound of the slots each TA may hold
     * @param c the total number of slots to be held
     * @return a map from each TA to assigned slot, so that no two TAs occupy
     *          the same slot, each TA holds between a and b slots, and
     *          the total number of slots served is exactly c, provided that
     *          a schedule is possible; if no schedule is possible, {@code null}
     */
    Map<T, Set<S>> officeHours(Set<S> slots, Map<T, Set<S>> available, int a,
            int b, int c);
}
