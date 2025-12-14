package test.demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    void testPlus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex result = a.plus(b);
        assertEquals(4, result.getRe(), 1e-9);
        assertEquals(6, result.getIm(), 1e-9);
    }

    @Test
    void testMinus() {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(2, 3);
        Complex result = a.minus(b);
        assertEquals(3, result.getRe(), 1e-9);
        assertEquals(4, result.getIm(), 1e-9);
    }

    @Test
    void testTimes() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex result = a.times(b);
        assertEquals(-5, result.getRe(), 1e-9);
        assertEquals(10, result.getIm(), 1e-9);
    }

    @Test
    void testDivide() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, -4);
        Complex result = a.divide(b);
        assertEquals(-0.2, result.getRe(), 1e-9);
        assertEquals(0.4, result.getIm(), 1e-9);
    }

    @Test
    void testConjugate() {
        Complex a = new Complex(2, -3);
        Complex result = a.conjugate();
        assertEquals(2, result.getRe(), 1e-9);
        assertEquals(3, result.getIm(), 1e-9);
    }

    @Test
    void testLengthSQ() {
        Complex a = new Complex(3, 4);
        assertEquals(25, a.lengthSQ(), 1e-9);
    }
}
