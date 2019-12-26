package cpecmu.cpe218.sp2020.hw4;

import java.util.Set;

public interface MaxWeightIndepSet {

    /**
     * Return an independent set of maximum total weight, given a path graph.
     * @param w the weight array, where w[i] is the weight of node i in
     *          the path graph
     * @return a set of node numbers in the given path graph that forms
     *          an independent set, i.e., nodes are not adjacent to one another,
     *          such that the sum of their weights are maximum possible
     */
    Set<Integer> maxWeight(int[] w);

}
