package cpecmu.cpe218.sp2019.hw3.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import cpecmu.cpe218.sp2019.hw3.CardEquivQuery;
import cpecmu.cpe218.sp2019.hw3.CardEquivQueryImpl;
import cpecmu.cpe218.sp2019.hw3.CardMajority;

public class CardMajorityImpl implements CardMajority {

    /** input file name */
    protected static final String inFile = "hw3tests/cardmajor01.in";

    @Override
    public int majorityCard(CardEquivQuery q) {
        /* BEGIN sample usage of CardEquivQuery; feel free to remove
        for (int i = 0; i < q.size(); i++)
            for (int j = 0; j < q.size(); j++)
                System.out.println(i + " " + j + " " + q.areEquivalent(i, j));
         * END sample usage
         */
        // TODO Your code here
        return -261218;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();
            CardEquivQuery q = new CardEquivQueryImpl(a);

            // invoke algorithm
            CardMajority sbm = new CardMajorityImpl();
            int res = sbm.majorityCard(q);
            System.out.println("Majority card: " + res);
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
