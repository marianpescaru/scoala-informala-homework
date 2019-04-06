package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClockTest {

    /** this is test program for Clock application
     * Tests that "Showing the time based on user 2 inputs
     * hour hh and minutes mm" is running correctly
     *
     * @author Marian Pescaru
     */

    Clock testClock = new Clock();

    @Test
    public void hoursTestOK (){
        int resultHour = testClock.hours(5);
        Assertions.assertEquals(resultHour,5);
        // tests that user input 5 as hour is returned as hour 5;
    }

    @Test
    public void minTestOK(){
        int resultMin = testClock.minutes(20);
        Assertions.assertEquals(resultMin,20);
        // tests that user input 20 as minutes is returned as 20 min;
    }

    @Test
    public void hoursTestNOK (){
        int resultHour = testClock.hours(-2);
        Assertions.assertEquals(resultHour,99);
        // tests that user input as not existing hour is returned as error
    }

    @Test
    public void minTestNOK(){
        int resultMin = testClock.minutes(67);
        Assertions.assertEquals(resultMin,99);
        // tests that user input as not existing minute value is returned as error
    }
}