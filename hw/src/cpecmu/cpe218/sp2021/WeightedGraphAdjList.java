package cpecmu.cpe218.sp2021;

import java.util.Set;

public class WeightedGraphAdjList<V, L> extends
        GenericGraphAdjList<V, Pair<V, L>> implements WeightedGraph<V, L> {

    @Override
    public void addEdge(V src, V dst, L lbl) {
        Set<Pair<V, L>> adj = adjList.get(src);
        adj.removeIf((p) -> p.fst().equals(dst));
        adj.add(new Pair<>(dst, lbl));
    }

}
