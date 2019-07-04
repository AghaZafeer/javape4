package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {


   @Test
    public void test1()
   {
       String res =StringTranspose.stringTranspose("this is bottle");
       assertEquals("siht si elttob",res);
   }

    @Test
    public void test2()
    {
        String res =StringTranspose.stringTranspose("");
        assertEquals("",res);
    }

    @Test
    public void test3()
    {
        String res =StringTranspose.stringTranspose("good boy");
        assertEquals("doog yob",res);
    }



}