package cpecmu.cpe218.sp2021.hw2;

import cpecmu.cpe218.sp2021.Graph;

public interface GraphBuilder {

    /**
     * Construct, if possible, an undirected graph in which each vertex
     * has the given degree.
     * @param <V> the vertex type
     * @param degrees the degree of each vertex
     * @param vertices the list of vertices, whose length is the same as
     *          the length of {@code degrees}
     * @return an undirected graph whose vertices are {@code vertices}, where
     *          {@code vertices[i]} has degree {@code degrees[i]};
     *          or {@code null} if it is impossible to construct such a graph
     *          from the given input
     */
    <V> Graph<V> buildGraph(int[] degrees, V[] vertices);

}
