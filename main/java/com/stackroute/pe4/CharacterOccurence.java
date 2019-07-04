package com.stackroute.pe4;

public class CharacterOccurence {

    public static int characterOccurence(String input,char ch)
    {
        int lengthofinput=input.length();//length of given input
        input=input.replaceAll(String.valueOf(ch), "");//length of string replacing given char
        return lengthofinput-input.length();//subtraction gives count of chars
    }
}
