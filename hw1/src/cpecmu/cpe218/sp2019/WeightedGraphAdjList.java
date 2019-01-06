package cpecmu.cpe218.sp2019;

public class WeightedGraphAdjList<V, L> extends
        GenericGraphAdjList<V, Pair<V, L>> implements WeightedGraph<V, L> {

    @Override
    public void addEdge(V src, V dst, L lbl) {
        adjList.get(src).add(new Pair<>(dst, lbl));
    }

}
