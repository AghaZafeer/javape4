package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleWordOccurenceTest {

    @Test
    public void test1()
    {
        String res=MultipleWordOccurence.findMultipleWordOccurence("She sells seashells by the seashore","se");
        assertEquals("Found at:4-6\nFound at:10-12\nFound at:27-29",res);
    }

    @Test
    public void test2()
    {
        String res=MultipleWordOccurence.findMultipleWordOccurence("weather is so cloudy,sky is covered totally by cloud.","cloud");
        assertEquals("Found at:14-19\nFound at:47-52",res);
    }

    @Test
    public void test3()
    {
        String res=MultipleWordOccurence.findMultipleWordOccurence("move here and there"," ");
        assertEquals("Found at:4-5\nFound at:9-10\nFound at:13-14",res);
    }


}