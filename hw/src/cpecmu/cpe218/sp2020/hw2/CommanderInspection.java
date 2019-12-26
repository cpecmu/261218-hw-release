package cpecmu.cpe218.sp2020.hw2;

import java.util.List;
import java.util.Set;

import cpecmu.cpe218.sp2020.Pair;

public interface CommanderInspection {

    /**
     * Determine the points in time to inspect workers' shifts, so that
     * every shift is inspected at some point, and the total number of
     * inspections is minimized.
     * @param shifts the worker's shifts, each of which is a pair (s, t)
     *          indicating that the shift starts at time s and ends at time t
     * @return a set of inspection times that covers every shift, such that
     *          the number of inspection times is as small as possible
     */
    Set<Integer> inspectionTimes(List<Pair<Integer, Integer>> shifts);

}
