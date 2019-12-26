package cpecmu.cpe218.sp2020.hw4.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2020.hw4.InheritanceDivision;

public class InheritanceDivisionImpl implements InheritanceDivision {

    /** input file name */
    protected static final String inFile = "hw4tests/inheritancediv01.in";

    protected int[] v;

    public InheritanceDivisionImpl(int[] v) {
        this.v = v;
    }

    @Override
    public int[] itemValues() {
        return v;
    }

    // TODO Might be useful to declare certain fields here, to avoid repeating
    // computation

    @Override
    public int minDifference() {
        // TODO Your code here
        return -1;
    }

    @Override
    public Set<Integer> firstPersonItems() {
        // TODO Your code here (optional)
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++)
                v[i] = s.nextInt();

            // invoke algorithm
            InheritanceDivision sbm = new InheritanceDivisionImpl(v);
            int res = sbm.minDifference();
            System.out.println(res);
            Set<Integer> resItems = sbm.firstPersonItems();
            if (resItems != null)
                System.out.println("Items for first person: " + resItems);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
