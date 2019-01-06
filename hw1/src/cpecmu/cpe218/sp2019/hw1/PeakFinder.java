package cpecmu.cpe218.sp2019.hw1;

public interface PeakFinder {

    /**
     * Find a position in the given array such that its value is at least the
     * value(s) of its adjacent position(s).
     * This operation takes O(lg n) time, where n is the size of the array.
     * @param a the input array
     * @return a position in {@code a} such that a[i] is at least a[i-1]
     *          (if exists) and at least a[i+1] (if exists)
     */
    int peakPosition(int[] a);

}
