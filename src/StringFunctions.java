package src;

import Stringfunctions.StringUtils;

public class StringFunctions {

    public static void main(String[] args){

        StringUtils stringUtils = new StringUtils();

        String arg = "Hey this is Malolan!";

        String reverse = stringUtils.reverse(arg);

        System.out.println("Actual String: " +arg);
        System.out.println("Reversed String: " +reverse);
    }
    
}
