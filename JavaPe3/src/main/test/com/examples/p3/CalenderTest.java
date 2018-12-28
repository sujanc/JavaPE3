package com.examples.p3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalenderTest {
    @Test
    public void testCalender() throws Exception {
        //Arrange
        String[] expectedValue = {"Mon 24/12/2018","Sun 30/12/2018"};
         Calender s = new Calender();
        //Act
        String[] actualValue=s.date();
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}