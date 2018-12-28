package com.examples.p3;
import junit.framework.Assert;
import org.junit.Test;


public class StudentMarksTest {
    @Test
    public void TestStudentMarks() throws Exception {
        int[] array = new int[]{89, 98, 86, 91};
        StudentMarks s= new StudentMarks();
        String expected = "Grade of student is 89\nGrade of student is 98\nGrade of student is 86\nGrade of student is 91";
        String actual = s.studentMarks(array,4);
        Assert.assertEquals(expected, actual);
    }

}