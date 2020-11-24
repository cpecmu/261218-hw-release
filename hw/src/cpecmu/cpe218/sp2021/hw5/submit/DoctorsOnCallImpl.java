package cpecmu.cpe218.sp2021.hw5.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2021.hw5.DoctorsOnCall;

public class DoctorsOnCallImpl<D> implements DoctorsOnCall<D> {

    /** input file name */
    protected static final String inFile = "hw5tests/doctors01.in";

    @Override
    public Map<D, Set<Integer>> dutySchedule(int[] p,
            Map<D, Set<Integer>> prefs) {
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

            // invoke algorithm
            DoctorsOnCall<String> sbm = new DoctorsOnCallImpl<>();
            Map<String, Set<Integer>> res = sbm.dutySchedule(p, prefs);
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
