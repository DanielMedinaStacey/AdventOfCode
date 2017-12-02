package com.github.danielmedinastacey;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


import java.io.IOException;


public class AdventOfCodeTest {

    @Test
    public void oneTest() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOne_test1");
        assertEquals( 3,dayone.getSolution());
    }

    @Test
    public void twoTest() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOne_test2");
        assertEquals(4, dayone.getSolution());
    }

    @Test
    public void threeTest() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOne_test3");
        assertEquals(0, dayone.getSolution());
    }

    @Test
    public void fourTest() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOne_test4");
        assertEquals(9, dayone.getSolution());
    }

    @Test
    public void oneTestB() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOneB_1");
        assertEquals( 6,dayone.getSolutionB());
    }

    @Test
    public void twoTestB() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOneB_2");
        assertEquals(0, dayone.getSolutionB());
    }

    @Test
    public void threeTestB() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOneB_3");
        assertEquals(4, dayone.getSolutionB());
    }

    @Test
    public void fourTestB() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOneB_4");
        assertEquals(12, dayone.getSolutionB());
    }

    @Test
    public void fiveTestB() throws IOException {
        DayOne dayone = new DayOne("/home/dms/GitHub/AdventOfCode/input/inputOneB_5");
        assertEquals(4, dayone.getSolutionB());
    }

    @Test
    public void dayTwoTest() throws IOException {
        DayTwo dayTwo = new DayTwo("/home/dms/GitHub/AdventOfCode/input/inputTwo_test");
        assertEquals(18, dayTwo.solution());
    }

    @Test
    public void dayTwoBTest() throws IOException {
        DayTwo dayTwo = new DayTwo("/home/dms/GitHub/AdventOfCode/input/inputTwoB_test");
        assertEquals(9, dayTwo.solutionB());
    }


}