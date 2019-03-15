package cpecmu.cpe218.sp2019.hw5.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2019.hw5.DoctorsOnCallRelaxed;

public class DoctorsOnCallRelaxedImpl<D> implements DoctorsOnCallRelaxed<D> {

    /** input file name */
    protected static final String inFile = "hw5tests/doctorsrelaxed01.in";

    @Override
    public Map<D, Set<Integer>> dutySchedule(int[] p,
            Map<D, Set<Integer>> prefs, int c) {
        // TODO Your code here
        throw new RuntimeException("unimplemented");
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read demand for each day
            int n = s.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = s.nextInt();
            // read preferences
            int k = s.nextInt();
            Map<String, Set<Integer>> prefs = new LinkedHashMap<>();
            for (int i = 0; i < k; i++) {
                String name = s.next();
                Set<Integer> available = new LinkedHashSet<>();
                int nAvailable = s.nextInt();
                for (int j = 0; j < nAvailable; j++)
                    available.add(s.nextInt());
                prefs.put(name, available);
            }
            // read "slack" days
            int c = s.nextInt();

            // invoke algorithm
            DoctorsOnCallRelaxed<String> sbm = new DoctorsOnCallRelaxedImpl<>();
            Map<String, Set<Integer>> res = sbm.dutySchedule(p, prefs, c);
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
