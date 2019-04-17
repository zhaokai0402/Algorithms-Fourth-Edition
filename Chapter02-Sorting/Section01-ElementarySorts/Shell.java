import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Selection
 */
public class Shell {

    public static void sort(Comparable[] a) {
        int max = a.length;
        int h = 1;
        while(h < (max / 3))
            h = 3 * h + 1;

        while (h >= 1) {
            for(int i = h; i < max; i++)
            {
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }
        for (int i = 0; i < max; i++) {
            int min = i;
            for (int j = i + 1; j < max; j++) {
                if(less(a[j], a[min]))
                    min = j;
                exch(a, i, min);
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if(less(a[i], a[i-1]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}