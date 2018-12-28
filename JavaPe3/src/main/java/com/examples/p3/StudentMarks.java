package com.examples.p3;

import java.util.Scanner;

public class StudentMarks {


  public String studentMarks (int stuGrades[],int numOfStudents){
String str="";
      for(int i=0;i<numOfStudents;i++)
      {
          if(stuGrades[i]<0 || stuGrades[i]>100)
              System.out.println("Error "+ stuGrades[i]);
          else
              str=str+"Grade of student is "+stuGrades[i]+"\n";


      }
      return str.trim();

  }


public static void main(String args[]){
    StudentMarks obj = new StudentMarks();
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of Students");
    int numOfStudents= scan.nextInt();
    int stuGrades[] =new int[numOfStudents];
    System.out.println("Enter the grade of the individual student");
    for(int i=0;i<numOfStudents;i++)
    {
        stuGrades[i]=scan.nextInt();
    }
    System.out.println(obj.studentMarks(stuGrades,numOfStudents));
}


}
