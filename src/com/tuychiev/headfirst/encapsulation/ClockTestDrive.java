package com.tuychiev.headfirst.encapsulation;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 11/1/21
 */
class Clock {
    private String time;

    public void setTime(String t) {
        time = t;
    }

    public String getTime() {
        return time;
    }
}

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setTime("1245");
        String tod = clock.getTime();
        System.out.println("time: " + tod);
    }
}
