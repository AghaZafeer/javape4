package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleWordOccurence {

    public static String findMultipleWordOccurence(String input,String word)
    {
        Pattern pattern=Pattern.compile(word);//pattern created for string to be checked
        Matcher matcher=pattern.matcher(input);//matcher object created 
        String res="";
        while(matcher.find())//matches the word to be checked in given input
        {
            res+="Found at:"+matcher.start()+"-"+matcher.end()+"\n";//positions of given word
        }
        return res.substring(0,res.length()-1);
    }
}
