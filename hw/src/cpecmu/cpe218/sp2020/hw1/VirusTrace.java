package cpecmu.cpe218.sp2020.hw1;

import java.util.List;

import cpecmu.cpe218.sp2020.Triple;

public interface VirusTrace {

    /**
     * Determine, given a trace of computer communications, whether the
     * destination computer is infected with a virus by the given time,
     * if the source virus is infected with a virus at the given time.
     * @param <V> the type representing computers
     * @param trace the trace of computer communications, ordered by
     *          ascending communication time
     * @param src the source computer
     * @param x the time the source computer is infected
     * @param dst the destination computer
     * @param y the time to determine whether the destination computer
     *          is infected
     * @return {@code true} if {@code dst} is infected by time {@code y};
     *          {@code false} otherwise
     */
    <V> boolean infected(List<Triple<V, V, Integer>> trace, V src, int x, V dst,
            int y);

}
