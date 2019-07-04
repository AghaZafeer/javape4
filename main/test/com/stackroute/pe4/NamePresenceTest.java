package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class NamePresenceTest {

    @Test
    public void test1()
    {
        boolean res=NamePresence.isNamePresent("This is Harry","is");
        assertEquals(true,res);
    }

    @Test
    public void test2()
    {
        boolean res=NamePresence.isNamePresent("This is Harry","harry");
        assertEquals(false,res);
    }

    @Test
    public void test3()
    {
        boolean res=NamePresence.isNamePresent("This is Harry","Harry");
        assertEquals(true,res);
    }

}