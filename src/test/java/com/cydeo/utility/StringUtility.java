package com.cydeo.utility;

public class StringUtility {

    public static void equalsTexts(String actual, String expected) {
        if (actual.equals(expected)){
            System.out.println("PASS");
        }else {
            System.err.println("FAIL");
            System.out.println("ACTUAL : " +actual +" EXPECTED : "+expected);
        }
    }
}
