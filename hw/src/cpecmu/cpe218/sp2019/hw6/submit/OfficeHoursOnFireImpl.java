package cpecmu.cpe218.sp2019.hw6.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2019.hw6.OfficeHoursOnFire;

public class OfficeHoursOnFireImpl<D, T, S>
        implements OfficeHoursOnFire<D, T, S> {

    /** input file name */
    protected static final String inFile = "hw6tests/officehoursfire01.in";

    @Override
    public Map<T, Set<S>> officeHours(Map<D, Integer> ds, Map<D, Set<S>> slots,
            Map<T, Set<S>> available, int a, int b, int c) {
        // TODO Your code here
        throw new RuntimeException("unimplemented");
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read days
            int d = s.nextInt();
            Map<String, Integer> ds = new LinkedHashMap<>();
            Map<String, Set<String>> daySlots = new LinkedHashMap<>();
            for (int i = 0; i < d; i++) {
                String day = s.next();
                ds.put(day, s.nextInt());
                daySlots.put(day, new LinkedHashSet<>());
            }
            // read slots
            Set<String> slots = new HashSet<>();
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                String slot = s.next();
                String day = s.next();
                if (!ds.containsKey(day))
                    throw new IllegalArgumentException("unknown day: " + day);
                daySlots.get(day).add(slot);
                slots.add(slot);
            }
            // read TAs
            int m = s.nextInt();
            Map<String, Set<String>> available = new LinkedHashMap<>();
            for (int i = 0; i < m; i++) {
                String ta = s.next();
                // read holdable slots
                int k = s.nextInt();
                Set<String> holdable = new LinkedHashSet<>();
                for (int j = 0; j < k; j++) {
                    String slot = s.next();
                    if (!slots.contains(slot))
                        throw new IllegalArgumentException("unknown slot: "
                                + slot);
                    holdable.add(slot);
                }
                available.put(ta, holdable);
            }
            // read schedule parameters
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            // invoke algorithm
            OfficeHoursOnFire<String, String, String> sbm =
                    new OfficeHoursOnFireImpl<>();
            Map<String, Set<String>> res =
                    sbm.officeHours(ds, daySlots, available, a, b, c);
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
