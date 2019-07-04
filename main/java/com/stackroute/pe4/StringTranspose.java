package com.stackroute.pe4;

public class StringTranspose {

    public static String stringTranspose(String input)
    {
        String arr[]=input.split(" ");
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            StringBuffer sb=new StringBuffer(arr[i]);
                    sb.reverse();
            res+=sb.toString()+" ";
        }
        return res.trim();
    }
}
