package com.github.danielmedinastacey;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.File;



public class DayOneTest {

    @Test
    public void oneTest(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOne_test1"));
        assertEquals( 3,dayone.getSolution());
    }

    @Test
    public void twoTest(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOne_test2"));
        assertEquals(4, dayone.getSolution());
    }

    @Test
    public void threeTest(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOne_test3"));
        assertEquals(0, dayone.getSolution());
    }

    @Test
    public void fourTest(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOne_test4"));
        assertEquals(9, dayone.getSolution());
    }

    @Test
    public void oneTestB(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOneB_1"));
        assertEquals( 6,dayone.getSolutionB());
    }

    @Test
    public void twoTestB(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOneB_2"));
        assertEquals(0, dayone.getSolutionB());
    }

    @Test
    public void threeTestB(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOneB_3"));
        assertEquals(4, dayone.getSolutionB());
    }

    @Test
    public void fourTestB(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOneB_4"));
        assertEquals(12, dayone.getSolutionB());
    }

    @Test
    public void fiveTestB(){
        DayOne dayone = new DayOne(new File("/home/dms/GitHub/AdventOfCode/input/inputOneB_5"));
        assertEquals(4, dayone.getSolutionB());
    }


}