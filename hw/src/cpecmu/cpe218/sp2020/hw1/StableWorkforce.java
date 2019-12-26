package cpecmu.cpe218.sp2020.hw1;

import java.util.Map;
import java.util.Set;

public interface StableWorkforce {

    /**
     * Compute a stable matching for the workforce, given the workforce
     * preferences.
     * @param <C> the company type
     * @param <W> the worker type
     * @param wp the workforce preference
     * @return a stable matching for the workforce, represented as a map
     *          from a company to the set of workers assigned to that company
     */
    <C, W> Map<C, Set<W>> stableMatching(WorkforcePreferences<C, W> wp);

}
