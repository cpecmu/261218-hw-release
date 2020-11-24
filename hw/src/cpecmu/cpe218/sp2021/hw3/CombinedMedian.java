package cpecmu.cpe218.sp2021.hw3;

public interface CombinedMedian {

    /**
     * Return the overall median of the values in the given databases.
     * @param q the databases that can be queried, where each database
     *          contains the same number of values
     * @return the overall median of the values in {@code q}
     */
    int combinedMedian(KthValueQuery q);

}
