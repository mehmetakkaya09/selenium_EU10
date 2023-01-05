package com.cydeo.utility;

public class WaitUtility {
    public static void waitSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



}
