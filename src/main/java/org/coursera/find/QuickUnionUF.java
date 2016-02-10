package org.coursera.find;

import java.util.Arrays;

public class QuickUnionUF implements UnionFind {

    private int[] ids;

    public QuickUnionUF(int N) {

        ids = new int[N];
        for (int i = 0; i < N; i++) {
            ids[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void connect(int p, int q) {
        ids[root(p)] = root(q);
    }

    private int root(int i) {
        while (i != ids[i]) {
           i = ids[i];
        }

        return i;
    }

    @Override
    public String toString() {
        return "QuickUnionUF{" +
                "ids=" + Arrays.toString(ids) +
                '}';
    }
}
