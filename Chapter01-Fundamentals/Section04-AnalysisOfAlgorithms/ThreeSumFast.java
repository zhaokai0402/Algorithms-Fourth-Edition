
import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * ThreeSum
 */
public class ThreeSumFast {

    public static int count(int[] a) {
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if(BinarySearch.indexOf(a, -a[i]-a[j]) > j)
                    cnt++;

        return cnt;
    }
    public static void main(String[] args) {
        In inputfile = new In(args[0]);
        int [] a = inputfile.readAllInts();
        StdOut.println(count(a));
    }
}