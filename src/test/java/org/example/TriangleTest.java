package org.example;

import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TriangleTest {

    @DataProvider(name = "isPositive")
    public static Object[][] isPositive() {
        return new Object[][]{
                {new Triangle(40, 30, 50), true},
                {new Triangle(-3, 5, -2), false},
                {new Triangle(2, 3, 2), true},
                {new Triangle(0, 2, -1), false}};
    }

    @DataProvider(name = "regularTriangle")
    public static Object[][] regularTriangle() {
        return new Object[][]{
                {new Triangle(250, 160, 240), true},
                {new Triangle(1, 2, 1), false},
                {new Triangle(17, 12, 20), true},
                {new Triangle(3, 1, 1), false}};
    }


    @DataProvider(name = "equilateral")
    public static Object[][] equilateral() {
        return new Object[][]{
                {new Triangle(2, 2, 2), true},
                {new Triangle(500, 500, 700), false},
                {new Triangle(1000, 1000, 1000), true},
                {new Triangle(250, 160, 240), false}};
    }

    @DataProvider(name = "isosceles")
    public static Object[][] isosceles() {
        return new Object[][]{
                {new Triangle(2, 3, 2), true},
                {new Triangle(17, 12, 20), false},
                {new Triangle(500, 500, 700), true},
                {new Triangle(250, 160, 240), false}};
    }


    @Test(dataProvider = "isPositive")
    void isPositive(Triangle checkTriangle, Boolean expected) {
        Assert.assertEquals(checkTriangle.isPositive(), expected);
    }

    @Test(dataProvider = "regularTriangle")
    void regularTriangle(Triangle checkTriangle, Boolean expected) {
        Assert.assertEquals(checkTriangle.regularTriangle(), expected);
    }


    @Test(dataProvider = "equilateral")
    void equilateral(Triangle checkTriangle, Boolean expected) {
        Assert.assertEquals(checkTriangle.equilateral(), expected);
    }

    @Test(dataProvider = "isosceles")
    void isosceles(Triangle checkTriangle, Boolean expected) {
        Assert.assertEquals(checkTriangle.isosceles(), expected);
    }
}




