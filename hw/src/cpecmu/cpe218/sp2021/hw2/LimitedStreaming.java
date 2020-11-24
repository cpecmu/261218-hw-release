package cpecmu.cpe218.sp2021.hw2;

import java.util.List;

import cpecmu.cpe218.sp2021.Pair;

public interface LimitedStreaming {

    /**
     * Determine whether the given streams can be transmitted while respecting
     * the constraint.
     * The constraint is that, for each natural number t>0, the total number
     * of bits sent over the time interval from 0 to t cannot exceed
     * t*quota.
     * @param streams the list of streams to be sent, one at a time.
     *          Each stream is a pair (b, t), indicating that b bits will be
     *          sent at a constant rate over time t.
     * @param quota the quota to be enforced in the constraint
     * @return a list of streams in the order sent, if all the streams can be
     *          transmitted without violating the constraint; otherwise,
     *          {@code null}, if not all streams can be sent
     */
    List<Pair<Integer, Integer>> hasStreamSchedule(
            List<Pair<Integer, Integer>> streams, int quota);

}
