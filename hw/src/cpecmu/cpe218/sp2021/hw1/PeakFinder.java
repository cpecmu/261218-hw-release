package cpecmu.cpe218.sp2021.hw1;

public interface PeakFinder {

    /**
     * Find a position in the given array such that its value is at least the
     * value(s) of its adjacent position(s).
     * This operation takes O(lg n) time, where n is the size of the array.
     * @param a the input array
     * @return a position {@code i} in {@code a} such that {@code a[i]}
     *          is at least {@code a[i-1]} (if exists) and at least
     *          {@code a[i+1]} (if exists)
     */
    int peakPosition(int[] a);

}
