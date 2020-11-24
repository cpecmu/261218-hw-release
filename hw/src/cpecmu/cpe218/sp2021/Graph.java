package cpecmu.cpe218.sp2021;

/**
 * An interface for representing graphs.
 * @author Chinawat
 *
 * @param <V> the vertex type
 */
public interface Graph<V> extends GenericGraph<V, V> {

    /**
     * Add an edge to this graph.
     * The source and destination vertices must already be in the graph.
     * @param src the source vertex
     * @param dst the destination vertex
     */
    void addEdge(V src, V dst);

}
