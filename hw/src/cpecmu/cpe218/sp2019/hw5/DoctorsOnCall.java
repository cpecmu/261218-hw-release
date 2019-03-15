package cpecmu.cpe218.sp2019.hw5;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Chinawat
 *
 * @param <D> type of doctors
 */
public interface DoctorsOnCall<D> {

    /**
     * Construct a duty schedule of doctors on duty, so that each day has the
     * number of doctors exactly as desired, or report that such a schedule
     * does not exist.
     * @param p an array indicating the number of required doctors on duty for
     *          each day
     * @param prefs a map indicating the days each doctor is willing to work,
     *          i.e., each entry associated with a doctor is a set of integers
     *          indicating the days that the doctor is available
     * @return a map indicating the days that each doctor will be on duty,
     *          i.e., each entry associated with a doctor is a set of integers
     *          indicating the days that the doctor will need to work,
     *          provided that a valid duty schedule exists, i.e., day {@code i}
     *          has exactly {@code p[i]} doctors on duty, and each doctor works
     *          only on their available days; otherwise, {@code null}
     *          (when there is no such schedule)
     */
    Map<D, Set<Integer>> dutySchedule(int[] p, Map<D, Set<Integer>> prefs);
}
