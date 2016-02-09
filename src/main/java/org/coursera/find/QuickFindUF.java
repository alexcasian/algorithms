package org.coursera.find;

import java.util.Arrays;

public class QuickFindUF implements QuickFind {

    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        assert(id != null || (id.length != 0 && id.length > p && id.length > q)) : "Illegal arguments found";
        return id[p] == id[q];
    }

    @Override
    public void connect(int p, int q) {
        if (connected(p, q)) {
            return;
        }

        int idp = id[p];
        int idq = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == idp) {
                id[i] = idq;
            }
        }
    }

    @Override
    public String toString() {
        return "QuickFindUF{" +
                "id=" + Arrays.toString(id) +
                '}';
    }
}
