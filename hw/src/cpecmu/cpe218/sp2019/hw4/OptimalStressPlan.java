package cpecmu.cpe218.sp2019.hw4;

public interface OptimalStressPlan {

    /**
     * Return the array containing revenue for low-stress job in each week.
     * @return the array containing revenue for low-stress job in each week
     */
    int[] lowStressPay();

    /**
     * Return the array containing revenue for high-stress job in each week
     * @return the array containing revenue for high-stress job in each week
     */
    int[] highStressPay();

    /**
     * Return the value of an optimal plan, given the revenues of
     * low- and high-stress jobs in each week.
     * @return the value of an optimal plan
     */
    int optimalPlanValue();

    /**
     * Return an optimal plan that attains the revenue of
     * {@link #optimalPlanValue()} (optional).
     * This method should only be called after {@link #optimalPlanValue()}.
     * @return an optimal plan, represented by an array whose entries are
     *          what to do each week.  Value 0 indicates "none"--no work done,
     *          value 1 indicate "low-stress job" should be done, and value 2
     *          indicate "high-stress job" should be done.
     */
    int[] optimalPlan();
}
