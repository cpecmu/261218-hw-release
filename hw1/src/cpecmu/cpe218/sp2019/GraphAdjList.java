package cpecmu.cpe218.sp2019;

public class GraphAdjList<V> extends GenericGraphAdjList<V, V>
        implements Graph<V> {

    @Override
    public void addEdge(V src, V dst) {
        adjList.get(src).add(dst);
    }

}
