package org.coursera.find;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindUFTest {

    private UnionFind unionFind;
    private static final int SIZE = 10;

    @Before
    public void setUp() {
        unionFind = new QuickFindUF(SIZE);
        System.out.println("State of the internal data structure BEFORE processing: " + unionFind.toString());
    }

    @After
    public void tearDown() {
        System.out.println("State of the internal data structure AFTER processing:  " + unionFind.toString());
        unionFind = null;
    }

    @Test
    public void testConnected() {
        assertFalse("0 and 1 cannot be connected yet", unionFind.connected(0, 1));

    }

    @Test
    public void testConnect() {
        assertFalse("0 and 1 cannot be connected yet", unionFind.connected(0, 1));
        unionFind.connect(0, 1);
        assertTrue("0 and 1 must be connected already", unionFind.connected(0, 1));

    }
}
