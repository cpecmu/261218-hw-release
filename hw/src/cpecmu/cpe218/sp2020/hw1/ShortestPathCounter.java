package cpecmu.cpe218.sp2020.hw1;

import cpecmu.cpe218.sp2020.Graph;

public interface ShortestPathCounter {

    /**
     * Determine the number of shortest paths from the given source vertex
     * to the given destination vertex in the given undirected graph.
     * @param <V> the vertex type
     * @param g the input graph
     * @param src the source vertex
     * @param dst the destination vertex
     * @return the number of shortest paths from {@code src} to {@code dst}
     */
    <V> int numShortestPaths(Graph<V> g, V src, V dst);

}
