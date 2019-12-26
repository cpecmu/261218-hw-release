package cpecmu.cpe218.sp2020.hw1;

import java.util.Set;

/**
 * An interface for the stable workforce matching problem
 * @author Chinawat
 *
 * @param <C> the type of companies
 * @param <W> the type of workers
 */
public interface WorkforcePreferences<C, W> {

    /**
     *
     * @return the set of companies in the workforce
     */
    Set<C> companies();

    /**
     *
     * @return the set of workers in the workforce
     */
    Set<W> workers();

    /**
     * Return the capacity of the given company, which is
     * the number of workers that the company can hire.
     * @param c the company of interest
     * @return the worker capacity of {@code c}
     */
    int capacity(C c);

    /**
     * Return the worker at the specified position on the given company's
     * preference list.
     * @param c the company of interest
     * @param pos the preference position, starting from zero, which
     *          corresponds to the top-ranked worker
     * @return the worker at position {@code pos} on {@code c}'s preference
     *          list
     */
    W companyPref(C c, int pos);

    /**
     * Return the rank of the given worker on the given company's
     * preference list.
     * @param c the company of interest
     * @param w the worker to look up
     * @return the rank of {@code w} on {@code c}'s preference list, where
     *          zero means the top-ranked worker
     */
    int companyRank(C c, W w);

    /**
     * Return the company at the specified position on the given worker's
     * preference list.
     * @param w the worker of interest
     * @param pos the preference position, starting from zero, which
     *          corresponds to the top-ranked company
     * @return the company at position {@code pos} on {@code w}'s preference
     *          list
     */
    C workerPref(W w, int pos);

    /**
     * Return the rank of the given company on the given worker's
     * preference list.
     * @param w the worker of interest
     * @param c the company to look up
     * @return the rank of {@code c} on {@code w}'s preference list, where
     *          zero means the top-ranked company
     */
    int workerRank(W w, C c);

}
