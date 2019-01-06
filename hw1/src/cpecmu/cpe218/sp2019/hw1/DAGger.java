package cpecmu.cpe218.sp2019.hw1;

import java.util.List;

import cpecmu.cpe218.sp2019.Graph;
import cpecmu.cpe218.sp2019.Pair;

public interface DAGger {

    /**
     * Determine whether the given directed graph has a cycle.
     * If the graph does not have a cycle, return a topological ordering
     * of the graph; otherwise, return a cycle in the graph.
     * @param <V> the vertex type
     * @param g the input graph
     * @return a pair whose first coordinate is a boolean and second coordinate
     *          is a list.  The boolean should be {@code true} if {@code g} is
     *          a DAG, or {@code false} if {@code g} contains a cycle.
     *          If {@code g} is a DAG, the list should be a topological
     *          ordering of {@code g}; otherwise, the list should be a cycle in
     *          {@code g}.
     */
    <V> Pair<Boolean, List<V>> hasTopoOrCycle(Graph<V> g);

}
