/* *****************************************************************************
 *  Name:              Pilseon Kim
 *  Coursera User ID:  123456
 *  Last modified:     June 17, 2022
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int idx = 0;
        
        while (!StdIn.isEmpty()) {
            String target = StdIn.readString();
            idx += 1;
            if (StdRandom.bernoulli(1.0 / idx)) {
                champion = target;
            }
        }
        StdOut.println(champion);
    }
}
