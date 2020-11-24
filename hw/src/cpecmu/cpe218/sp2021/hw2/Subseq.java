package cpecmu.cpe218.sp2021.hw2;

import java.util.List;

public interface Subseq {

    /**
     * Determine whether the given patterns is a subsequence in the haystack.
     * @param <E> the element types
     * @param patterns a sequence of items to look for
     * @param haystack a sequence of items to be searched
     * @return {@code true} if there is a way to delete some items in
     *          {@code haystack} so that the resulting sequence is equal to
     *          {@code patterns}; {@code false} otherwise
     */
    <E> boolean isSubsequence(List<E> patterns, List<E> haystack);

}
