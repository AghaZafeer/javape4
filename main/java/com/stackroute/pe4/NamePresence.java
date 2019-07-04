package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePresence {

    public static boolean isNamePresent(String input,String regex)
    {
        Pattern pattern=Pattern.compile(regex);//pattern for given word
        Matcher matcher=pattern.matcher(input);//matcher object created
        boolean matchfound=matcher.find();//finds the word in given input
        return matchfound;
    }
}
