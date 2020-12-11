package cpecmu.cpe218.sp2021.hw2.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import cpecmu.cpe218.sp2021.hw2.GetawayCarFinder;

public class GetawayCarFinderImpl implements GetawayCarFinder {

    /** input file name */
    protected static final String inFile = "hw2tests/getawaycar01.in";

    @Override
    public boolean hasMatchingTimestamps(int[] estimates, int[] errors,
            int[] timestamps) {
        // TODO Your code here
        throw new RuntimeException("unimplemented");
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] estimates = new int[n];
            int[] errors = new int[n];
            for (int i = 0; i < n; i++) {
                // read estimate
                estimates[i] = s.nextInt();
                // read margin of error
                errors[i] = s.nextInt();
            }
            int[] timestamps = new int[n];
            for (int i = 0; i < n; i++) {
                // read timestamp
                timestamps[i] = s.nextInt();
            }

            // invoke algorithm
            GetawayCarFinder sbm = new GetawayCarFinderImpl();
            boolean res =
                    sbm.hasMatchingTimestamps(Arrays.copyOf(estimates, n),
                                              Arrays.copyOf(errors, n),
                                              Arrays.copyOf(timestamps, n));
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
