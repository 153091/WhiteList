/** Просматривает читаемые слова, и если слово совпало со словом
 * из списка Allowlist.txt, то печатает его 
 * %java AllowList.java AllowList.txt < Tale.txt
 it was the of it was the of it was the of it was the of it was the of it
 was the of it was the of it was the of it was the of it was the of
 */


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.TreeSet;

public class AllowList {

    public static void main(String[] args) {

        // empty set of strings
        TreeSet<String> set = new TreeSet<>();

        // read in white list
        In in = new In(args[0]);
        while (!in.isEmpty())
            set.add(in.readString());

        // print words that in list
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            if (set.contains(word))
                StdOut.print(word+ " ");
        }

    }
}
