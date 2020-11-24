package cpecmu.cpe218.sp2021;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * An implementation of maximum flow using Ford--Fulkerson algorithm.
 * @author Chinawat
 *
 * @param <V> the vertex type
 */
public class FordFulkerson<V> implements NetworkFlow<V> {

    @Override
    public Pair<Integer, WeightedGraph<V, Integer>> maximumFlow(
            WeightedGraph<V, Integer> g, V s, V t) {
        // construct residual graph
        WeightedGraph<V, Integer> rg = new WeightedGraphAdjList<>();
        for (V v : g.vertices())
            rg.addVertex(v);
        for (V v : g.vertices())
            for (Pair<V, Integer> e : g.adjacentFrom(v))
                rg.addEdge(v, e.fst(), e.snd());
        // run algorithm
        int maxFlow = intermediateMaximumFlow(rg, s, t, 0);
        // extract flow values for each edge
        WeightedGraph<V, Integer> flow = new WeightedGraphAdjList<>();
        for (V v : g.vertices())
            flow.addVertex(v);
        for (V v : g.vertices())
            for (Pair<V, Integer> e : g.adjacentFrom(v)) {
                V w = e.fst();
                flow.addEdge(v, w, edgeWeight(rg, w, v) - edgeWeight(g, w, v));
            }
        return new Pair<>(maxFlow, flow);
    }

    @Override
    public int intermediateMaximumFlow(WeightedGraph<V, Integer> rg, V s, V t,
            int currentFlowValue) {
        int maxFlow = currentFlowValue;
        Pair<Integer, List<V>> augmentingPath;
        while ((augmentingPath = augmentingPath(rg, s, t)) != null) {
            int bottleneck = augmentingPath.fst();
            maxFlow += bottleneck;
            // adjust flow and recompute residual graph
            Iterator<V> itr = augmentingPath.snd().iterator();
            V u = itr.next();
            while (itr.hasNext()) {
                V v = itr.next();
                // decrease (u, v) by bottleneck
                rg.addEdge(u, v, edgeWeight(rg, u, v) - bottleneck);
                // increase (v, u) by bottleneck
                rg.addEdge(v, u, edgeWeight(rg, v, u) + bottleneck);

                u = v;
            }
        }
        return maxFlow;
    }

    protected Pair<Integer, List<V>> augmentingPath(
            WeightedGraph<V, Integer> rg, V s, V t) {
        // run BFS, considering only positive-weight edges
        Map<V, V> discovered = new HashMap<>();
        List<V> q = new LinkedList<>();
        discovered.put(s, null);
        q.add(s);
        while (!q.isEmpty()) {
            V v = q.remove(0);
            for (Pair<V, Integer> e : rg.adjacentFrom(v)) {
                V w = e.fst();
                if (e.snd() > 0 && !discovered.containsKey(w)) {
                    discovered.put(w, v);
                    q.add(w);
                    if (w.equals(t)) {
                        // reached sink; reconstruct path and find bottleneck
                        int bottleneck = -1;
                        List<V> vs = new LinkedList<>();
                        vs.add(0, t);
                        V next = t;
                        while (v != null) {
                            int c = edgeWeight(rg, v, next);
                            if (bottleneck == -1 || bottleneck > c)
                                bottleneck = c;
                            vs.add(0, v);

                            next = v;
                            v = discovered.get(v);
                        }
                        return new Pair<>(bottleneck, vs);
                    }
                }
            }
        }
        return null;
    }

    protected int edgeWeight(WeightedGraph<V, Integer> g, V u, V v) {
        for (Pair<V, Integer> e : g.adjacentFrom(u))
            if (e.fst().equals(v)) return e.snd();
        return 0;
    }

}
