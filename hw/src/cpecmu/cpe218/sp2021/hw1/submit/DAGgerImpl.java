package cpecmu.cpe218.sp2021.hw1.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import cpecmu.cpe218.sp2021.Graph;
import cpecmu.cpe218.sp2021.GraphAdjList;
import cpecmu.cpe218.sp2021.Pair;
import cpecmu.cpe218.sp2021.hw1.DAGger;

public class DAGgerImpl implements DAGger {

    /** input file name */
    protected static final String inFile = "hw1tests/dagger01.in";

    @Override
    public <V> Pair<Boolean, List<V>> hasTopoOrCycle(Graph<V> g) {
        // TODO Your code here
        return new Pair<>(false, null);
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            Graph<String> g = new GraphAdjList<>();
            // read graph
            int n = s.nextInt();
            for (int i = 0; i < n; i++)
                g.addVertex(s.next());
            int m = s.nextInt();
            for (int i = 0; i < m; i++)
                g.addEdge(s.next(), s.next());

            // invoke algorithm
            DAGger sbm = new DAGgerImpl();
            Pair<Boolean, List<String>> res = sbm.hasTopoOrCycle(g);
            System.out.println("Has " + (res.fst() ? "DAG" : "cycle"));
            System.out.println(res.snd());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
