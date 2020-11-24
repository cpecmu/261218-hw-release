package cpecmu.cpe218.sp2021.hw6.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2021.Pair;
import cpecmu.cpe218.sp2021.Triple;
import cpecmu.cpe218.sp2021.hw6.BoxNesting;

public class BoxNestingImpl<B> implements BoxNesting<B> {

    /** input file name */
    protected static final String inFile = "hw6tests/boxnesting01.in";

    @Override
    public Pair<Integer, Set<Pair<B, B>>> minVisibleBoxes(
            Map<B, Triple<Integer, Integer, Integer>> dimensions) {
        // TODO Your code here
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            Map<String, Triple<Integer, Integer, Integer>> dimensions =
                    new LinkedHashMap<>();
            for (int i = 0; i < n; i++)
                dimensions.put(s.next(),
                               new Triple<>(s.nextInt(),
                                            s.nextInt(),
                                            s.nextInt()));

            // invoke algorithm
            BoxNesting<String> sbm = new BoxNestingImpl<>();
            Pair<Integer, Set<Pair<String, String>>> res =
                    sbm.minVisibleBoxes(dimensions);
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
