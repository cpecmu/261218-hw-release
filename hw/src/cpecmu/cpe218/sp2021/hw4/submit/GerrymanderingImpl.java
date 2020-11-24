package cpecmu.cpe218.sp2021.hw4.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2021.hw4.Gerrymandering;

public class GerrymanderingImpl implements Gerrymandering {

    /** input file name */
    protected static final String inFile = "hw4tests/gerrymandering01.in";

    protected int m;
    protected int[] a;

    public GerrymanderingImpl(int m, int[] a) {
        this.m = m;
        this.a = a;
    }

    @Override
    public int precinctSize() {
        return m;
    }

    @Override
    public int[] partyAvoters() {
        return a;
    }

    // TODO Might be useful to declare certain fields here, to avoid repeating
    // computation

    @Override
    public boolean isSusceptible() {
        // TODO Your code here
        throw new RuntimeException("unimplemented");
    }

    @Override
    public Set<Integer> districtPrecincts() {
        // TODO Your code here (optional)
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = s.nextInt();

            // invoke algorithm
            Gerrymandering sbm = new GerrymanderingImpl(m, a);
            boolean res = sbm.isSusceptible();
            System.out.println(res);
            if (res) {
                Set<Integer> resDistrict = sbm.districtPrecincts();
                if (resDistrict != null)
                    System.out.println("Precincts in a district: "
                            + resDistrict);
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
