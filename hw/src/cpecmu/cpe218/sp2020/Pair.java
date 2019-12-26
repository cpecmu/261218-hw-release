package cpecmu.cpe218.sp2020;

public class Pair<T1, T2> {
    protected T1 fst;
    protected T2 snd;

    public Pair(T1 fst, T2 snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public T1 fst() {
        return fst;
    }

    public T2 snd() {
        return snd;
    }

    @Override
    public String toString() {
        return "(" + fst + ", " + snd + ")";
    }
}
