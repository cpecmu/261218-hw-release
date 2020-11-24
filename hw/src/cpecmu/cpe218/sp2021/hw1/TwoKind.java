package cpecmu.cpe218.sp2021.hw1;

import cpecmu.cpe218.sp2021.WeightedGraph;

public interface TwoKind {

    /**
     * Determine whether the given classification is consistent.
     * @param <V> the vertex type
     * @param g the input graph representing the classification
     * @return {@code true} if g is consistent;
     *          {@code false} otherwise
     */
    <V> boolean isConsistent(WeightedGraph<V, Boolean> g);

}
