package cpecmu.cpe218.sp2020.hw1.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2020.hw1.StableWorkforce;
import cpecmu.cpe218.sp2020.hw1.WorkforcePreferences;
import cpecmu.cpe218.sp2020.hw1.WorkforcePreferencesImpl;

public class StableWorkforceImpl implements StableWorkforce {

    /** input file name */
    protected static final String inFile = "hw1tests/stablewf01.in";

    @Override
    public <C, W> Map<C, Set<W>> stableMatching(WorkforcePreferences<C, W> wp) {
        // TODO You code here
        return new HashMap<>();
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read capacities and preferences
            int nc = s.nextInt();
            Map<String, Integer> capacity = new LinkedHashMap<>();
            for (int i = 0; i < nc; i++)
                capacity.put(s.next(), s.nextInt());
            int nw = s.nextInt();
            Map<String, List<String>> wPrefs = new LinkedHashMap<>();
            for (int i = 0; i < nw; i++) {
                List<String> pref = new ArrayList<>(nc);
                String w = s.next();
                for (int j = 0; j < nc; j++)
                    pref.add(s.next());
                wPrefs.put(w, pref);
            }
            Map<String, List<String>> cPrefs = new LinkedHashMap<>();
            for (int i = 0; i < nc; i++) {
                List<String> pref = new ArrayList<>(nw);
                String c = s.next();
                for (int j = 0; j < nw; j++)
                    pref.add(s.next());
                cPrefs.put(c, pref);
            }
            // construct problem instance
            WorkforcePreferences<String, String> wp =
                    new WorkforcePreferencesImpl<>(capacity, cPrefs, wPrefs);

            // invoke algorithm
            StableWorkforce sbm = new StableWorkforceImpl();
            Map<String, Set<String>> res = sbm.stableMatching(wp);
            for (Map.Entry<String, Set<String>> e : res.entrySet()) {
                System.out.print(e.getKey() + ":");
                for (String w : e.getValue())
                    System.out.print(" " + w);
                System.out.println();
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
