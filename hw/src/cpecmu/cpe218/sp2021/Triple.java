package cpecmu.cpe218.sp2021;

public class Triple<T1, T2, T3> extends Pair<T1, T2> {
    protected T3 trd;

    public Triple(T1 fst, T2 snd, T3 trd) {
        super(fst, snd);
        this.trd = trd;
    }

    public T3 trd() {
        return trd;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ", " + trd + ")";
    }
}
