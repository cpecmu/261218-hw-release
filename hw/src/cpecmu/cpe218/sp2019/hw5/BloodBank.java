package cpecmu.cpe218.sp2019.hw5;

public interface BloodBank {

    /**
     * Determine whether the given blood supply is enough for the given demand.
     * @param supply an array of length 4, where
     *          - supply[0] is the number of units of blood type O available
     *          - supply[1] is the number of units of blood type A available
     *          - supply[2] is the number of units of blood type B available
     *          - supply[3] is the number of units of blood type AB available
     * @param demand an array of length 4, where
     *          - demand[0] is the number of units of blood type O in need
     *          - demand[1] is the number of units of blood type A in need
     *          - demand[2] is the number of units of blood type B in need
     *          - demand[3] is the number of units of blood type AB in need
     * @return {@code true} if the given blood supply is enough for the
     *          given demand; {@false} otherwise
     */
    boolean satisfiableInventory(int[] supply, int[] demand);
}
