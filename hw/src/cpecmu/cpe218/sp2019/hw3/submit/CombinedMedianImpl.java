package cpecmu.cpe218.sp2019.hw3.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import cpecmu.cpe218.sp2019.hw3.CombinedMedian;
import cpecmu.cpe218.sp2019.hw3.KthValueQuery;
import cpecmu.cpe218.sp2019.hw3.KthValueQueryImpl;

public class CombinedMedianImpl implements CombinedMedian {

    /** input file name */
    protected static final String inFile = "hw3tests/combmedian02.in";

    @Override
    public int combinedMedian(KthValueQuery q) {
        /* BEGIN sample usage of KthValueQuery; feel free to remove
        for (int i = 0; i < q.size(); i++) {
            System.out.println(q.fstKthSmallest(i));
            System.out.println(q.sndKthSmallest(i));
        }
         * END sample usage
         */
        // TODO Your code here
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++)
                b[i] = s.nextInt();
            KthValueQuery q = new KthValueQueryImpl(a, b);

            // invoke algorithm
            CombinedMedian sbm = new CombinedMedianImpl();
            int res = sbm.combinedMedian(q);
            System.out.println("Median: " + res);
            System.out.println("# of queries issued: " + q.queryCount());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
