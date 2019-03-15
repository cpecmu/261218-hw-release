package cpecmu.cpe218.sp2019.hw5.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2019.hw5.PotluckSchedule;

public class PotluckScheduleImpl<P, N> implements PotluckSchedule<P, N> {

    /** input file name */
    protected static final String inFile = "hw5tests/potluck02.in";

    /* Might be useful:
     * Set difference A=A-B can be performed by calling
        A.removeAll(B);
     * This will **destructively** update A to hold only elements that are not
     * in B.  You might want to duplicate the original set A first by calling
        Set<...> Adup = new HashSet<>(A);
     * If set X has exactly one element, we can obtain that element using
     * this expression:
        X.iterator().next()
     */

    @Override
    public Map<P, N> correctedSchedule(Set<N> nights, Map<P, Set<N>> busyNights,
            Map<P, N> almostCorrectSchedule) {
        // TODO Your code here
        throw new RuntimeException("unimplemented");
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            Set<Integer> nights = new LinkedHashSet<>();
            for (int i = 0; i < n; i++)
                nights.add(s.nextInt());
            // read busy days
            Map<String, Set<Integer>> busyNights = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                String name = s.next();
                Set<Integer> busy = new LinkedHashSet<>();
                int nBusy = s.nextInt();
                for (int j = 0; j < nBusy; j++)
                    busy.add(s.nextInt());
                busyNights.put(name, busy);
            }
            // read "almost correct" schedule
            Map<String, Integer> schedule = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                String name = s.next();
                schedule.put(name, s.nextInt());
            }
            // sanity check
            int nAssignedNights = new HashSet<>(schedule.values()).size();
            if (nAssignedNights != n - 1)
                throw new IllegalArgumentException("Schedule does not have "
                        + (n - 1) + " distinct nights assigned to people, but "
                        + nAssignedNights);
            for (Map.Entry<String, Integer> entry : schedule.entrySet()) {
                String name = entry.getKey();
                int night = entry.getValue();
                if (busyNights.get(name).contains(night))
                    throw new IllegalArgumentException(name
                            + " assigned to cook on night " + night
                            + ", but actually busy that night");
            }

            // invoke algorithm
            PotluckSchedule<String, Integer> sbm = new PotluckScheduleImpl<>();
            Map<String, Integer> res =
                    sbm.correctedSchedule(nights, busyNights, schedule);
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
