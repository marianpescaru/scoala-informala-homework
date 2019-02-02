package com.sci.bv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumTest {

    /** This is the test for getting the maximum from 3 numbers given by user input
     *
     *
     * @author Marian Pescaru
     */

    @Test
    void getMax() {
        Assertions.assertEquals(Maximum.getMax(5,6),6);
    }

    @Test
    void getMaxTrue(){
        Assertions.assertTrue(Maximum.getMax(2,3)>2);
    }

    @Test
    void getMaxFalse(){
        Assertions.assertFalse(Maximum.getMax(4,5)<5);
    }

}