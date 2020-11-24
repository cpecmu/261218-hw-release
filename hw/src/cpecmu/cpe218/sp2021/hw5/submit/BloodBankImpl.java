package cpecmu.cpe218.sp2021.hw5.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import cpecmu.cpe218.sp2021.hw5.BloodBank;

public class BloodBankImpl implements BloodBank {

    /** input file name */
    protected static final String inFile = "hw5tests/bloodbank01.in";

    /* Might be useful:
     * You can invoke the provided maximum flow algorithm by writing
        NetworkFlow<V> nf = new FordFulkerson<>();
        Pair<Integer, WeightedGraph<V, Integer>> mf = nf.maximumFlow(g, s, t);
     * Arguments: g is a flow network to find maximum flow, s is source, and
     * t is sink.
     * Result: mf is a pair, where the first component is the maximum flow, and
     * the second component is the assigned flow for each edge.
     * See detailed documentation in cpecmu.cpe218.sp2019.NetworkFlow.
     */

    @Override
    public boolean satisfiableInventory(int[] supply, int[] demand) {
        // TODO Your code here
        throw new RuntimeException("unimplemented");
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int[] supply = new int[4];
            int[] demand = new int[4];
            for (int i = 0; i < 4; i++) {
                supply[i] = s.nextInt();
                demand[i] = s.nextInt();
            }

            // invoke algorithm
            BloodBank sbm = new BloodBankImpl();
            boolean res = sbm.satisfiableInventory(supply, demand);
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
