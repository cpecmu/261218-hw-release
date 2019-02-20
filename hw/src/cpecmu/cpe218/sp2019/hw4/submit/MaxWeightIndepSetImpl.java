package cpecmu.cpe218.sp2019.hw4.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2019.hw4.MaxWeightIndepSet;

public class MaxWeightIndepSetImpl implements MaxWeightIndepSet {

    /** input file name */
    protected static final String inFile = "hw4tests/mxwindepset01.in";

    @Override
    public Set<Integer> maxWeight(int[] w) {
        // TODO Your code here
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] w = new int[n];
            for (int i = 0; i < n; i++)
                w[i] = s.nextInt();

            // invoke algorithm
            MaxWeightIndepSet sbm = new MaxWeightIndepSetImpl();
            Set<Integer> res = sbm.maxWeight(w);
            System.out.println(res);
            if (res != null) {
                int sum = 0;
                for (int v : res)
                    sum += w[v];
                System.out.println("Total weight: " + sum);
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
