package com.examples.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Calender {

    public String[] date(){


String cal[] =new String[2];
                // Get calendar set to current date and time
                Calendar c = Calendar.getInstance();


                // Set the calendar to monday of the current week
                c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

                System.out.println();
                // Print dates of the current week starting on Monday
                DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
                cal[0]=df.format(c.getTime()).trim();
                for (int i = 0; i <6; i++) {
                    c.add(Calendar.DATE, 1);
                }
                 cal[1]=df.format(c.getTime()).trim();
        return cal;
            }


    public static void main(String args[]){
        Calender obj = new Calender();
        String cal[] =new String[2];
               cal =obj.date();
               for(int i=0;i<2;i++)
                   System.out.println(cal[i]);

    }
}
