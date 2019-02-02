package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FahrenheitTest {

    /** Test for temperature conversion Fahrenheit to Celsius
     *
     * @author Marian Pescaru
     */

    Fahrenheit tempf = new Fahrenheit();

    @Test
    public void fahrenheitCheckOK () {
        int result = tempf.temperatureConversion(104);
        Assertions.assertEquals(result,40);
        // check if conversion temp F in temp C is correct
        }

    @Test
    public void fahrenheitCheckNOK () {
        Assertions.assertFalse(Fahrenheit.temperatureConversion(104)>40);
        }
        // exercise of 'assertFalse' assertion
    }
