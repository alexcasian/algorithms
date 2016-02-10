package org.coursera.find;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class QuickUnionUFTest {

    private UnionFind quickUnion;

    @Before
    public void setUp() {

        quickUnion = new QuickUnionUF(10);
        System.out.println("State before test: " + quickUnion.toString());
    }

    @After
    public void tearDown() {
        System.out.println("State after test:  " + quickUnion.toString());
    }

    @Test
    public void testConnected() {
       assertFalse("Not yet connected", quickUnion.connected(0, 1));
    }

    @Test
    public void testConnect() {
        assertFalse("Wrong precondition, cannot be connected at this time", quickUnion.connected(0, 1));
        quickUnion.connect(0, 1);
        assertTrue("Must be connected", quickUnion.connected(0, 1));
    }
}
