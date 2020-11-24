package cpecmu.cpe218.sp2021.hw1.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cpecmu.cpe218.sp2021.Triple;
import cpecmu.cpe218.sp2021.hw1.VirusTrace;

public class VirusTraceImpl implements VirusTrace {

    /** input file name */
    protected static final String inFile = "hw1tests/virustrace01.in";

    @Override
    public <V> boolean infected(List<Triple<V, V, Integer>> trace, V src, int x,
            V dst, int y) {
        // TODO Your code here
        return false;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read trace
            int n = s.nextInt();
            List<Triple<String, String, Integer>> trace = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                String c1 = s.next();
                String c2 = s.next();
                int time = s.nextInt();
                trace.add(new Triple<>(c1, c2, time));
            }

            // read Ca-x, Cb-y pairs
            int t = s.nextInt();
            for (int i = 0; i < t; i++) {
                String src = s.next();
                int x = s.nextInt();
                String dst = s.next();
                int y = s.nextInt();
                // invoke algorithm
                VirusTrace sbm = new VirusTraceImpl();
                System.out.println(sbm.infected(trace, src, x, dst, y));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
