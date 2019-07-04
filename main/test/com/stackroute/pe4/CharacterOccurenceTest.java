package com.stackroute.pe4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOccurenceTest {


    @Test
    public void test1()
    {
    int res=CharacterOccurence.characterOccurence("Agha Zafeer",'a');
    assertEquals(2,res);
    }

    @Test
    public void test2()
    {
        int res=CharacterOccurence.characterOccurence("",'a');
        assertEquals(0,res);
    }

    @Test
    public void test3()
    {
        int res=CharacterOccurence.characterOccurence("anshuman",'n');
        assertEquals(2,res);
    }

}