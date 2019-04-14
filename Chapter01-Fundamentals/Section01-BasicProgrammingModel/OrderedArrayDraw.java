import java.util.Arrays;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

// from 1.1.9.8 标准绘图库.已排序随机数组
// java OrderedArrayDraw

public class OrderedArrayDraw{
    public static void main(String[] args)
    {
        int n = 50;
        double[] a = new double[n];
        for(int i=0; i<n; i++)
        {
            a[i] = StdRandom.uniform();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++)
        {
            double x = 1.0*i/n;
            double y = a[i]/2.0;
            double halfWidth = 0.5/n;
            double halfHeight = a[i]/2.0;
            StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
        }
    }
}