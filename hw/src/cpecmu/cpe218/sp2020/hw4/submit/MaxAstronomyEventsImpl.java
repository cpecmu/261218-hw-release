package cpecmu.cpe218.sp2020.hw4.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import cpecmu.cpe218.sp2020.hw4.MaxAstronomyEvents;

public class MaxAstronomyEventsImpl implements MaxAstronomyEvents {

    /** input file name */
    protected static final String inFile = "hw4tests/mxastroevents01.in";

    protected int[] d;

    public MaxAstronomyEventsImpl(int[] d) {
        this.d = d;
    }

    @Override
    public int[] eventCoordinates() {
        return d;
    }

    // TODO Might be useful to declare certain fields here, to avoid repeating
    // computation

    @Override
    public int maxObservableEvents() {
        // TODO Your code here
        return -1;
    }

    @Override
    public Set<Integer> observableEvents() {
        // TODO Your code here (optional)
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] d = new int[n];
            for (int i = 0; i < n; i++)
                d[i] = s.nextInt();

            // invoke algorithm
            MaxAstronomyEvents sbm = new MaxAstronomyEventsImpl(d);
            int res = sbm.maxObservableEvents();
            System.out.println(res);
            Set<Integer> resEvents = sbm.observableEvents();
            if (resEvents != null)
                System.out.println("Observable events: " + resEvents);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
