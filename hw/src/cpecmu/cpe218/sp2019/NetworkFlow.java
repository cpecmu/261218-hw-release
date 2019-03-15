package cpecmu.cpe218.sp2019;

/**
 * An interface for computing maximum flow.
 * @author Chinawat
 *
 * @param <V> the vertex type
 */
public interface NetworkFlow<V> {
    /**
     * Compute maximum flow.
     * @param g the flow network
     * @param s the source
     * @param t the sink
     * @return a pair of maximum flow, along with flow assigned to each edge
     *          in the given flow network
     */
    Pair<Integer, WeightedGraph<V, Integer>> maximumFlow(
            WeightedGraph<V, Integer> g, V s, V t);

    /**
     * Compute maximum flow from the given residual graph and given flow value.
     * This method destructively updates the given residual graph to one
     * associated with maximum flow.
     * @param rg the residual graph
     * @param s the source
     * @param t the sink
     * @param currentFlowValue the current flow value in the residual graph
     *          before invoking this method
     * @return
     */
    int intermediateMaximumFlow(WeightedGraph<V, Integer> rg, V s, V t,
            int currentFlowValue);
}
