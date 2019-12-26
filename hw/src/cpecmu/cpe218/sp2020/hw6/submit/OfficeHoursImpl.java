package cpecmu.cpe218.sp2020.hw6.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2020.hw6.OfficeHours;

public class OfficeHoursImpl<T, S> implements OfficeHours<T, S> {

    /** input file name */
    protected static final String inFile = "hw6tests/officehours01.in";

    @Override
    public Map<T, Set<S>> officeHours(Set<S> slots, Map<T, Set<S>> available,
            int a, int b, int c) {
        // TODO Your code here
        throw new RuntimeException("unimplemented");
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read slots
            int n = s.nextInt();
            Set<String> slots = new LinkedHashSet<>();
            for (int i = 0; i < n; i++)
                slots.add(s.next());
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
            OfficeHours<String, String> sbm = new OfficeHoursImpl<>();
            Map<String, Set<String>> res =
                    sbm.officeHours(slots, available, a, b, c);
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
