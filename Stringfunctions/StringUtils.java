package Stringfunctions;

public class StringUtils {

    public String reverse(String arg){

        if (null == arg){
            return "String cannot be null";
        }

        String reversedString = "";
        for(int i=0; i< arg.length(); i++){ 
            char ch = arg.charAt(i);
            reversedString = ch + reversedString;
        }
        return reversedString;
    }
    
}
