package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordsSortTest {

    @Test
    public void test1()
    {
        String res=WordsSort.wordsSort("abc acd aab");
        assertEquals("aab abc acd",res);

    }

    @Test
    public void test2()
    {
        String res=WordsSort.wordsSort("agha anshuman");
        assertEquals("agha anshuman",res);

    }

    @Test
    public void test3()
    {
        String res=WordsSort.wordsSort("bag bat baee");
        assertEquals("baee bag bat",res);

    }

}