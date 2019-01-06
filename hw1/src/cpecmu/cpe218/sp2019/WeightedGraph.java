package cpecmu.cpe218.sp2019;

/**
 * An interface for representing graphs with edge weights (or labels).
 * @author Chinawat
 *
 * @param <V> the vertex type
 * @param <L> the label type
 */
public interface WeightedGraph<V, L> extends GenericGraph<V, Pair<V, L>> {

    /**
     * Add an edge to this graph.
     * The source and destination vertices must already be in the graph.
     * @param src the source vertex
     * @param dst the destination vertex
     * @param lbl the label on the edge
     */
    void addEdge(V src, V dst, L lbl);

}
