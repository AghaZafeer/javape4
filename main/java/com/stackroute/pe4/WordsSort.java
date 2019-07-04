package com.stackroute.pe4;

import java.util.Arrays;

public class WordsSort {
    public static String wordsSort(String input)
    {
        String arr[]=input.split(" ");
        Arrays.sort(arr);
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            res+=arr[i]+" ";
        }
        return res.trim();
    }
}
