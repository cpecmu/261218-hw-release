package cpecmu.cpe218.sp2021.hw6;

import java.util.Map;
import java.util.Set;

import cpecmu.cpe218.sp2021.Pair;
import cpecmu.cpe218.sp2021.Triple;

/**
 *
 * @author Chinawat
 *
 * @param <B> type of boxes
 */
public interface BoxNesting<B> {

    /**
     * Compute the minimum number of visible boxes after nesting, along with
     * how to nest boxes.
     * @param dimensions a map from each box to its dimensions
     * @return a pair, whose
     *          - first element is an integer indicating the minimum number
     *            of visible boxes after nesting
     *          - second element is a set of pairs of boxes:
     *            - the first box is the smaller box
     *            - the second box is the larger box
     *            such that the smaller box is to be put immediately inside
     *            the larger box
     */
    Pair<Integer, Set<Pair<B, B>>> minVisibleBoxes(
            Map<B, Triple<Integer, Integer, Integer>> dimensions);
}
