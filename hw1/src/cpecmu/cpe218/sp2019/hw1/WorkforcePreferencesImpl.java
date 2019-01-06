package cpecmu.cpe218.sp2019.hw1;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkforcePreferencesImpl<C, W>
        implements WorkforcePreferences<C, W> {
    protected Map<C, Integer> capacity;
    protected Map<C, Map<Integer, W>> cPrefs;
    protected Map<C, Map<W, Integer>> cRanks;
    protected Map<W, Map<Integer, C>> wPrefs;
    protected Map<W, Map<C, Integer>> wRanks;

    public WorkforcePreferencesImpl(Map<C, Integer> capacity,
            Map<C, List<W>> cPrefs, Map<W, List<C>> wPrefs) {
        this.capacity = capacity;
        this.cPrefs = new HashMap<>();
        this.cRanks = new HashMap<>();
        for (Map.Entry<C, List<W>> pref : cPrefs.entrySet()) {
            C c = pref.getKey();
            Map<Integer, W> idx = new HashMap<>();
            Map<W, Integer> rank = new HashMap<>();
            int pos = 0;
            for (W w : pref.getValue()) {
                idx.put(pos, w);
                rank.put(w, pos);
                pos++;
            }
            this.cPrefs.put(c, idx);
            this.cRanks.put(c, rank);
        }
        this.wPrefs = new HashMap<>();
        this.wRanks = new HashMap<>();
        for (Map.Entry<W, List<C>> pref : wPrefs.entrySet()) {
            W w = pref.getKey();
            Map<Integer, C> idx = new HashMap<>();
            Map<C, Integer> rank = new HashMap<>();
            int pos = 0;
            for (C c : pref.getValue()) {
                idx.put(pos, c);
                rank.put(c, pos);
                pos++;
            }
            this.wPrefs.put(w, idx);
            this.wRanks.put(w, rank);
        }
    }

    @Override
    public Set<C> companies() {
        return Collections.unmodifiableSet(cPrefs.keySet());
    }

    @Override
    public Set<W> workers() {
        return Collections.unmodifiableSet(wPrefs.keySet());
    }

    @Override
    public int capacity(C c) {
        return capacity.get(c);
    }

    @Override
    public W companyPref(C c, int pos) {
        return cPrefs.get(c).get(pos);
    }

    @Override
    public int companyRank(C c, W w) {
        return cRanks.get(c).get(w);
    }

    @Override
    public C workerPref(W w, int pos) {
        return wPrefs.get(w).get(pos);
    }

    @Override
    public int workerRank(W w, C c) {
        return wRanks.get(w).get(c);
    }
}
