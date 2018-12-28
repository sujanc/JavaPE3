package com.examples.p3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    @Test
    public void testConsecutive() throws Exception {
        //Arrange
        String expectedValue = "The numbers 12,13,14 are consecutive";
        ConsecutiveNumbers s = new ConsecutiveNumbers();
        //Act
        String actualValue=s.consecutive("12,13,14");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}