package com.stackroute.pe4;

public class ReplaceChars {

    public static String replaceChars(String input,char firstch,char secondch,char firstreplacement,char secondreplacement)
    {

        String res=input.replace(firstch,firstreplacement);
        res=res.replace(secondch,secondreplacement);
        return res;
    }
}
