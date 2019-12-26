package cpecmu.cpe218.sp2020.hw4.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import cpecmu.cpe218.sp2020.hw4.OptimalStressPlan;

public class OptimalStressPlanImpl implements OptimalStressPlan {

    /** input file name */
    protected static final String inFile = "hw4tests/optstressplan01.in";

    protected int[] l, h;

    public OptimalStressPlanImpl(int[] l, int[] h) {
        this.l = l;
        this.h = h;
    }

    @Override
    public int[] lowStressPay() {
        return l;
    }

    @Override
    public int[] highStressPay() {
        return h;
    }

    // TODO Might be useful to declare certain fields here, to avoid repeating
    // computation

    @Override
    public int optimalPlanValue() {
        // TODO Your code here
        return -1;
    }

    @Override
    public int[] optimalPlan() {
        // TODO Your code here (optional)
        return null;
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            int[] l = new int[n], h = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = s.nextInt();
                h[i] = s.nextInt();
            }

            // invoke algorithm
            OptimalStressPlan sbm = new OptimalStressPlanImpl(l, h);
            int res = sbm.optimalPlanValue();
            System.out.println(res);
            int[] resPlan = sbm.optimalPlan();
            if (resPlan != null) {
                System.out.println("Optimal plan: ");
                for (int p : resPlan) {
                    switch (p) {
                    case 0:
                        System.out.println("none");
                        break;
                    case 1:
                        System.out.println("low-stress");
                        break;
                    case 2:
                        System.out.println("high-stress");
                        break;
                    default:
                        throw new RuntimeException("unknown action: " + p);
                    }
                }
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
