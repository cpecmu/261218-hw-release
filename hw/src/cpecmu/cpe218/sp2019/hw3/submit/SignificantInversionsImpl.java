package cpecmu.cpe218.sp2019.hw3.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import cpecmu.cpe218.sp2019.hw3.SignificantInversions;

public class SignificantInversionsImpl implements SignificantInversions {

    /** input file name */
    protected static final String inFile = "hw3tests/siginversions01.in";

    @Override
    public int significantInversions(int[] a) {
        // TODO Your code here
        return -1;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();

            // invoke algorithm
            SignificantInversions sbm = new SignificantInversionsImpl();
            int res = sbm.significantInversions(a);
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
