package cpecmu.cpe218.sp2021.hw2.submit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import cpecmu.cpe218.sp2021.Graph;
import cpecmu.cpe218.sp2021.GraphAdjList;
import cpecmu.cpe218.sp2021.hw2.GraphBuilder;

public class GraphBuilderImpl implements GraphBuilder {

    /** input file name */
    protected static final String inFile = "hw2tests/graphbuilder01.in";

    @Override
    public <V> Graph<V> buildGraph(int[] degrees, V[] vertices) {
        Graph<V> g = new GraphAdjList<>();
        for (V v : vertices)
            g.addVertex(v);
        // TODO Your code here
        return g;
    }

    protected static <V> void printGraph(Graph<V> g) {
        if (g == null)
            System.out.println(g);
        else for (V v : g.vertices())
            System.out.println(v + ": " + g.adjacentFrom(v));
    }

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(inFile);
             Scanner s = new Scanner(fr)) {
            int n = s.nextInt();
            String[] vertices = new String[n];
            int[] degrees = new int[n];
            for (int i = 0; i < n; i++) {
                // read vertex name
                vertices[i] = s.next();
                // read degree
                degrees[i] = s.nextInt();
            }

            // invoke algorithm
            GraphBuilder sbm = new GraphBuilderImpl();
            Graph<String> res = sbm.buildGraph(Arrays.copyOf(degrees, n),
                                               Arrays.copyOf(vertices, n));
            printGraph(res);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
