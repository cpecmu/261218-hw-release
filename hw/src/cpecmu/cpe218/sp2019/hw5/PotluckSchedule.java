package cpecmu.cpe218.sp2019.hw5;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Chinawat
 *
 * @param <P> type of people
 * @param <N> type of nights
 */
public interface PotluckSchedule<P, N> {

    /**
     * Construct a correct cooking schedule, if exists, from the given,
     * almost correct, schedule.
     * @param nights the set of nights to assign cooks
     * @param busyNights a map from each person to the set of nights that this
     *          person is busy, and should not be assigned to cook
     * @param almostCorrectSchedule a map from each person to a night that
     *          the person is supposed to cook, but with a mistake that
     *          two people are assigned the same night, and one night has no
     *          cook
     * @return a map from each person to a night that the person is supposed
     *          to cook, such that each person cooks for one night, and each
     *          night has a person who cooks, provided that this schedule is
     *          feasible; otherwise, {@code null}
     */
    Map<P, N> correctedSchedule(Set<N> nights, Map<P, Set<N>> busyNights,
            Map<P, N> almostCorrectSchedule);
}
