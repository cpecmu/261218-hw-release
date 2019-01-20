package cpecmu.cpe218.sp2019.hw2.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cpecmu.cpe218.sp2019.hw2.Subseq;

public class SubseqImpl implements Subseq {

    /** input file name */
    protected static final String inFile = "hw2tests/subseq01.in";

    @Override
    public <E> boolean isSubsequence(List<E> patterns, List<E> haystack) {
        // TODO Your code here
        return false;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read patterns
            int m = s.nextInt();
            s.nextLine();
            List<String> patterns = new ArrayList<>(m);
            for (int i = 0; i < m; i++)
                patterns.add(s.nextLine());
            // read haystack
            int n = s.nextInt();
            s.nextLine();
            List<String> haystack = new ArrayList<>(n);
            for (int i = 0; i < n; i++)
                haystack.add(s.nextLine());

            // invoke algorithm
            Subseq sbm = new SubseqImpl();
            boolean res = sbm.isSubsequence(patterns, haystack);
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
