package cpecmu.cpe218.sp2019;

import java.util.Set;

/**
 * An interface for representing graphs.
 * @author Chinawat
 *
 * @param <V> the vertex type
 * @param <V> the edge type
 */
public interface GenericGraph<V, E> {

    /**
     * Add a vertex to this graph.
     * Do nothing if the vertex has already been added to the graph.
     * @param v the vertex to be added
     */
    void addVertex(V v);

    /**
     *
     * @return the collection of vertices in this graph
     */
    Set<V> vertices();

    /**
     *
     * @param src the source vertex
     * @return the edges to which there is an edge from {@code src}
     */
    Set<E> adjacentFrom(V src);
}
