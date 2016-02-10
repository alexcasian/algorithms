package org.coursera.find;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuickFindUFTest {

    private QuickFind quickFind;
    private static final int SIZE = 10;

    @Before
    public void setUp() {
        quickFind = new QuickFindUF(SIZE);
        System.out.println("State of the internal data structure BEFORE processing: " + quickFind.toString());
    }

    @After
    public void tearDown() {
        System.out.println("State of the internal data structure AFTER processing:  " + quickFind.toString());
        quickFind = null;
    }

    @Test
    public void testConnected() {
        assertFalse("0 and 1 cannot be connected yet", quickFind.connected(0, 1));

    }

    @Test
    public void testConnect() {
        assertFalse("0 and 1 cannot be connected yet", quickFind.connected(0, 1));
        quickFind.connect(0, 1);
        assertTrue("0 and 1 must be connected already", quickFind.connected(0, 1));

    }
}
