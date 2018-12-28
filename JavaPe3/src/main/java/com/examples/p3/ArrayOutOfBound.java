package com.examples.p3;
import java.lang.reflect.Array;

public class ArrayOutOfBound {

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4};
        Integer age = null;
        try {
            int[] array1 = new int[-20];
            System.out.println(array[-1]);
            age.toString();
        }catch(NegativeArraySizeException ne) { System.out.println(ne);}
        catch (ArrayIndexOutOfBoundsException ae){ System.out.println(ae); }
        catch (NullPointerException nullex){ System.out.println(nullex); }
        System.out.println("Rest of the code");
    }
}