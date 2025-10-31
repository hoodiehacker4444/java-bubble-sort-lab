package bubble;

import java.util.*;

public class BubbleSorter {
    private int[] a;
    private long nVisits;
    private long nSwaps;


    public BubbleSorter(int[] a) {
        this.a = a;
    }


    public void sort() {
        nVisits = 0;
        nSwaps = 0;


        for (int i = 0; i < a.length - 1; i++) {
            boolean z = false;
            for (int j = a.length - 1; j > i; j--) {
                nVisits += 2;
                if (a[j] < a[j - 1]) {
                    nSwaps++;
                    swap(a, j, j - 1);
                    z = true;
                }
            }
            if (!z) {
                return;
            }
        }
    }

    public void swap(int[] whatever, int a, int b) {
        int temp = whatever[a];
        whatever[a] = whatever[b];
        whatever[b] = temp;
    }

    public String toString() {
        String s = nVisits + " visits, " + nSwaps + " swaps\n{";
        for (int n : a)
            s += " " + n;
        s += " }";
        return s;
    }

    public long getNVisits() {
        return nVisits;
    }


    public long getNSwaps() {
        return nSwaps;
    }


    public int[] getArray() {
        return a;
    }

}
