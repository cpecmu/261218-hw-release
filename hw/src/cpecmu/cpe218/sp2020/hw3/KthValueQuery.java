package cpecmu.cpe218.sp2020.hw3;

/**
 * An interface for representing a database system containing two databases,
 * each of which contains the same number of integers
 * @author Chinawat
 *
 */
public interface KthValueQuery {

    /**
     * Return the size of each database.
     * @return the size of each database
     */
    int size();

    /**
     * Return the k-th smallest element of the first database.
     * @param k the index of the smallest element, where 0 is the position of
     *          smallest element, and n-1 is the position of the largest
     * @return the k-th smallest element of the first database.
     */
    int fstKthSmallest(int k);

    /**
     * Return the k-th smallest element of the second database.
     * @param k the index of the smallest element, where 0 is the position of
     *          smallest element, and n-1 is the position of the largest
     * @return the k-th smallest element of the second database.
     */
    int sndKthSmallest(int k);

    /**
     * Return the number of queries issued to this database system.
     * @return the number of queries issued so far
     */
    int queryCount();
}
