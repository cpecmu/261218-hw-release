package cpecmu.cpe218.sp2020.hw4;

import java.util.Set;

public interface InheritanceDivision {

    /**
     * Return the array containing the value of each item in the inheritance.
     * @return the array containing the value of each item in the inheritance
     */
    int[] itemValues();

    /**
     * Return the minimum difference between the values of the two piles of
     * inheritance after division.
     * @return a nonnegative integer indicating the minimum difference between
     *          the two piles of inheritance after division
     */
    int minDifference();

    /**
     * Return the set of items that the first person receives, that minimizes
     * the difference of total value of items each person receives (optional).
     * This method should only be called after {@link #minDifference()}.
     * @return the set of item indices that the first person receives, that
     *          minimizes the difference between the values of the two piles
     *          of inheritance after performing division
     */
    Set<Integer> firstPersonItems();
}
