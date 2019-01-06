package cpecmu.cpe218.sp2019;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class GenericGraphAdjList<V, E> implements GenericGraph<V, E> {

    protected Map<V, Set<E>> adjList = new LinkedHashMap<>();

    public GenericGraphAdjList() {
    }

    @Override
    public void addVertex(V v) {
        if (!adjList.containsKey(v)) adjList.put(v, new LinkedHashSet<>());
    }

    @Override
    public Set<V> vertices() {
        return Collections.unmodifiableSet(adjList.keySet());
    }

    @Override
    public Set<E> adjacentFrom(V src) {
        return Collections.unmodifiableSet(adjList.get(src));
    }

}
