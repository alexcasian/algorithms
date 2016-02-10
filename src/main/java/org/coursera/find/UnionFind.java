package org.coursera.find;

/**
 * Created by acasian on 2/9/2016.
 */
public interface UnionFind {

    boolean connected(int p, int q);

    void connect(int p, int q);
}
