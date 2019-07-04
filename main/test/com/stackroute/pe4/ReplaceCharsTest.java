package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharsTest {


    @Test
    public void test1()
    {
        String res=ReplaceChars.replaceChars("Agha Zafeer",'e','a','b','d');
        assertEquals("Aghd Zdfbbr",res);
    }

    @Test
    public void test2()
    {
        String res=ReplaceChars.replaceChars("Anshuman",'n','a','e','l');
        assertEquals("Aeshumle",res);
    }

    @Test
    public void test3()
    {
        String res=ReplaceChars.replaceChars("Haria",'a','i','f','d');
        assertEquals("Hfrdf",res);
    }

}