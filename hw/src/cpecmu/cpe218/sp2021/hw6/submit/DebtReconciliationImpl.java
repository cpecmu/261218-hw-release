package cpecmu.cpe218.sp2021.hw6.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2021.Triple;
import cpecmu.cpe218.sp2021.hw6.DebtReconciliation;

public class DebtReconciliationImpl<F> implements DebtReconciliation<F> {

    /** input file name */
    protected static final String inFile = "hw6tests/debtrecon01.in";

    @Override
    public Set<Triple<F, F, Integer>> reconciliation(
            Set<Triple<F, F, Integer>> owed) {
        // TODO Your code here
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            Set<Triple<String, String, Integer>> owed = new LinkedHashSet<>();
            for (int i = 0; i < n; i++) {
                String fi = s.next();
                String fj = s.next();
                int amt = s.nextInt();
                owed.add(new Triple<>(fi, fj, amt));
            }

            // invoke algorithm
            DebtReconciliation<String> sbm = new DebtReconciliationImpl<>();
            Set<Triple<String, String, Integer>> res = sbm.reconciliation(owed);
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
