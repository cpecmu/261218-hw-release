package cpecmu.cpe218.sp2021.hw1.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import cpecmu.cpe218.sp2021.WeightedGraph;
import cpecmu.cpe218.sp2021.WeightedGraphAdjList;
import cpecmu.cpe218.sp2021.hw1.TwoKind;

public class TwoKindImpl implements TwoKind {

    /** input file name */
    protected static final String inFile = "hw1tests/twokind01.in";

    @Override
    public <V> boolean isConsistent(WeightedGraph<V, Boolean> g) {
        // TODO Your code here
        return false;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            WeightedGraph<String, Boolean> g = new WeightedGraphAdjList<>();
            // read graph
            int n = s.nextInt();
            for (int i = 0; i < n; i++)
                g.addVertex(s.next());
            int m = s.nextInt();
            // graph edge is "true" if the incident vertices are "same"
            // graph edge is "false" if the incident vertices are "different"
            for (int i = 0; i < m; i++) {
                String src = s.next();
                String dst = s.next();
                boolean same = s.next().equals("same") ? true : false;
                // add relationship in both directions
                g.addEdge(src, dst, same);
                g.addEdge(dst, src, same);
            }

            // invoke algorithm
            TwoKind sbm = new TwoKindImpl();
            System.out.println(sbm.isConsistent(g));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
