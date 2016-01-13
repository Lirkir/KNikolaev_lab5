package ru.spb.herzen.ivt3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase {
    App app;

    public void setUp() {
        app = new App();
    }

    public void test_add() {
        assertEquals(app.add(99, 2), 101);
        assertEquals(app.add(-1, 5077), 5076);

    }

    public void test_mult() {
        assertEquals(0, app.mult(0, 3));
    }

    public void test_expession() {
        assertEquals(5, app.expession(0), 0.0001);
        assertEquals(1.66666667f, app.expession(-2), 0.0001);
        assertEquals(Double.POSITIVE_INFINITY, app.expession(1), 0.000001);
    }

}
