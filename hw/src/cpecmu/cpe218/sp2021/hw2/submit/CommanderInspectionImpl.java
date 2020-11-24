package cpecmu.cpe218.sp2021.hw2.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2021.Pair;
import cpecmu.cpe218.sp2021.hw2.CommanderInspection;

public class CommanderInspectionImpl implements CommanderInspection {

    /** input file name */
    protected static final String inFile = "hw2tests/cmdinspect01.in";

    /*
       Might be useful:
       If you need to sort a list l, you can use method
           Collections.sort(l, comp)
       where comp is a Comparator, taking two elements from the list,
       and returning a negative integer if the first is "less than" the second,
       a positive integer if the first is "greater than" the second,
       and zero if they are equal.
       Example for comparing two pairs of integers:
            Comparator<Pair<Integer, Integer>> comp = (p1, p2) -> {
                // Compare first component first.
                // If not equal, the lower element is less.
                if (p1.fst() != p2.fst()) return p1.fst() - p2.fst();
                // If the first components are equal,
                // compare the second element.
                return p1.snd() - p2.snd();
            };
       See Java API on java.util.Comparator interface for more details.
    */

    @Override
    public Set<Integer> inspectionTimes(List<Pair<Integer, Integer>> shifts) {
        // TODO Your code here
        return new LinkedHashSet<>();
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            // read number of shifts
            int n = s.nextInt();
            List<Pair<Integer, Integer>> shifts = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                // read shift
                shifts.add(new Pair<>(s.nextInt(), s.nextInt()));
            }

            // invoke algorithm
            CommanderInspection sbm = new CommanderInspectionImpl();
            Set<Integer> res = sbm.inspectionTimes(shifts);
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
