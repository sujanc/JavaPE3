package com.examples.p3;

import java.util.Scanner;
import java.lang.*;
import static java.lang.Integer.valueOf;

public class ConsecutiveNumbers {

   public  String consecutive(String num){
       ;
       String ind[] = num.split(",");
       int diff;
       boolean flag = true;
       for(int i=0;i<ind.length-1;i++)
       {
           diff = valueOf(ind[i])-valueOf(ind[i+1]);
           if(Math.abs(diff)!=1) {
               flag = false;
               break;
           }
       }

       if(flag)
           return ("The numbers " +num+ " are consecutive");
       else
           return ("The numbers " +num+ " are not consecutive");
   }

public static void main(String args[]){

    ConsecutiveNumbers obj = new ConsecutiveNumbers();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the numbers");
    String num = scan.nextLine();
    System.out.println(obj.consecutive(num));

}

}
