package com.shivam;

import junit.framework.TestCase;
import org.junit.Assert;

public class MainTest extends TestCase {


    public void test_sqrt_positive() {
        double x = 4.0;
        double expectedResult = 3.0;
        Assert.assertEquals(expectedResult, Main.root(x), 0.001);
    }


    public void test_sqrt_negative() {
        double x = -4.0;
        double expectedResult = Double.NaN;
        Assert.assertEquals(expectedResult, Main.root(x), 0.001);
    }


    public void test_factorial_positive() {
        double x = 5;
        double expectedResult = 120;
        Assert.assertEquals(expectedResult, Main.fact(x),0.001);
    }


    public void test_factorial_negative() {
        double x = -4;
        double expectedResult = -1;
        Assert.assertEquals(expectedResult, Main.fact(x),0.001);
    }


    public void test_factorial_zero(){
        int x = 0;
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, Main.fact(x),0.001);
    }


    public void test_ln_positive() {
        double x = Math.E;
        double expectedResult = 1.0;  // ln(e) = 1
        Assert.assertEquals(expectedResult, Main.logar(x), 0.001);
    }


    public void test_ln_zero() {
        double x = 0.0;
        double expectedResult = Double.NaN;  // ln(0) is undefined
        Assert.assertEquals(expectedResult, Main.logar(x), 0.001);
    }


    public void test_ln_negative_input() {
        double x = -2.0;
        double expectedResult = Double.NaN;  // ln of negative number is undefined
        Assert.assertEquals(expectedResult, Main.logar(x), 0.001);
    }


    public void test_power_positive() {
        double x = 2.0;
        double y = 4.0;
        double expectedResult = 16.0;
        Assert.assertEquals(expectedResult, Main.power(x, y), 0.001);
    }


    public void test_power_zero_exponent() {
        double x = 5.0;
        double y = 0.0;
        double expectedResult = 1.0;  // Any number to the power of 0 is 1
        Assert.assertEquals(expectedResult, Main.power(x, y), 0.001);
    }


    public void test_power_negative_exponent() {
        double x = 2.0;
        double y = -2.0;
        double expectedResult = 0.25;  // 2^-2 = 1/4
        Assert.assertEquals(expectedResult, Main.power(x, y), 0.001);
    }
}
