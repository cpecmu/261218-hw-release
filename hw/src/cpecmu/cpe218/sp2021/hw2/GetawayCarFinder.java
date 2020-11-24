package cpecmu.cpe218.sp2021.hw2;

public interface GetawayCarFinder {

    /**
     * Determine whether the timestamps of a suspect matches the given
     * estimates and corresponding margins of error.
     * @param estimates the estimates of the suspect's entries/exits
     * @param errors the margins of error corresponding to the estimates,
     *          i.e., {@code errors[i]} is the margin of error for
     *          {@code estimates[i]}
     * @param timestamps the actual entry/exit timestamps of the suspect,
     *          in increasing order
     * @return {@code true} if the timestamps of the suspect matches
     *          the given estimates; {@code false} otherwise
     */
    boolean hasMatchingTimestamps(int[] estimates, int[] errors,
            int[] timestamps);

}
