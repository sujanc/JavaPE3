package com.examples.p3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlacesTest {
    @Test
    public void testPlaces() throws Exception {
        //Arrange
        List<String> expectedValue = new ArrayList<>();
        List<String> places = new ArrayList<>();
        places.add("Bangalore");
        expectedValue.add("Bnglr");
        Places s = new Places();
        //Act
        List<String> actualValue=s.vovels(places);
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}