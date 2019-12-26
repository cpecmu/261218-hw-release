package cpecmu.cpe218.sp2020.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthValueQueryImpl implements KthValueQuery {

    protected int n;
    protected List<Integer> l1, l2;
    protected int queryCount = 0;

    public KthValueQueryImpl(int[] a1, int[] a2) {
        if (a1.length != a2.length)
            throw new IllegalArgumentException("The two arrays must be of the same size.");
        n = a1.length;
        l1 = new ArrayList<>(n);
        l2 = new ArrayList<>(n);
        Set<Integer> s = new HashSet<>();
        for (int x : a1) {
            l1.add(x);
            if (s.contains(x))
                throw new IllegalArgumentException("Duplicate value: " + x);
        }
        for (int x : a2) {
            l2.add(x);
            if (s.contains(x))
                throw new IllegalArgumentException("Duplicate value: " + x);
        }
        Collections.sort(l1);
        Collections.sort(l2);
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public int fstKthSmallest(int k) {
        queryCount++;
        return l1.get(k);
    }

    @Override
    public int sndKthSmallest(int k) {
        queryCount++;
        return l2.get(k);
    }

    @Override
    public int queryCount() {
        return queryCount;
    }
}
