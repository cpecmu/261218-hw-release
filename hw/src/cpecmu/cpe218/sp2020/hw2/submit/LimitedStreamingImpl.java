package cpecmu.cpe218.sp2020.hw2.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cpecmu.cpe218.sp2020.Pair;
import cpecmu.cpe218.sp2020.hw2.LimitedStreaming;

public class LimitedStreamingImpl implements LimitedStreaming {

    /** input file name */
    protected static final String inFile = "hw2tests/ltdstream01.in";

    /*
       Might be useful:
       If you need to sort a list l, you can use method
           Collections.sort(l, comp)
       where comp is a Comparator, taking two elements from the list,
       and returning a negative integer if the first is "less than" the second,
       a positive integer if the first is "greater than" the second,
       and zero if they are equal.
       Example for comparing two pairs of integers:
            Comparator<Pair<Integer, Integer>> comp = (p1, p2) -> {
                // Compare first component first.
                // If not equal, the lower element is less.
                if (p1.fst() != p2.fst()) return p1.fst() - p2.fst();
                // If the first components are equal,
                // compare the second element.
                return p1.snd() - p2.snd();
            };
       See Java API on java.util.Comparator interface for more details.
    */

    @Override
    public List<Pair<Integer, Integer>> hasStreamSchedule(
            List<Pair<Integer, Integer>> streams, int quota) {
        // TODO Your code here
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read number of streams
            int n = s.nextInt();
            // read quota
            int q = s.nextInt();
            List<Pair<Integer, Integer>> streams = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                // read stream
                int b = s.nextInt();
                int t = s.nextInt();
                streams.add(new Pair<>(b, t));
            }

            // invoke algorithm
            LimitedStreaming sbm = new LimitedStreamingImpl();
            List<Pair<Integer, Integer>> res =
                    sbm.hasStreamSchedule(streams, q);
            System.out.println(res);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
