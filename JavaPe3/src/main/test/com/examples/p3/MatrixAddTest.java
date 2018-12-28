package com.examples.p3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAddTest {
    @Test
    public void testMatrix() throws Exception {
        //Arrange
        int[][] expectedValue = {{8,3,5},{7,9,11}};
        MatrixAdd s = new MatrixAdd();
        //Act
        int[][] mat1 = new int[][]{{1, 2,3}, {4, 5,6}};
        int[][] mat2 = new int[][]{{7, 1,2}, {3, 4,5}};

        int sum[][] = new int[2][3];

        int[][] actualValue=s.matAdd(mat1,mat2,2,3,sum);
        //Assert
        assertEquals(expectedValue, actualValue);
    }


}