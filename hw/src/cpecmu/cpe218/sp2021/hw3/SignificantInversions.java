package cpecmu.cpe218.sp2021.hw3;

public interface SignificantInversions {

    /**
     * Return the number of significant inversions in the given array.
     * @param a the array
     * @return the number of significant inversions in {@code a}, i.e.,
     *          the number of pairs (i, j) for which i < j, but a[i] > 2*a[j]
     */
    int significantInversions(int[] a);

}
