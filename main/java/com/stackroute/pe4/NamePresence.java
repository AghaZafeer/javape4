package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamePresence {

    public static boolean isNamePresent(String input,String regex)
    {
        Pattern pattern=Pattern.compile(regex);//pattern for given word
        Matcher matcher=pattern.matcher(input);//
        boolean matchfound=matcher.find();
        return matchfound;
    }
}
