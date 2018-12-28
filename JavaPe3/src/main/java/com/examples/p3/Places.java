package com.examples.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Places {

    public static void main(String args[]){
        Places obj =new Places();
        Scanner scan =new Scanner(System.in);
        List<String> places = new ArrayList<>();

        System.out.println("Enter the places");
        places.add(scan.nextLine());
        System.out.println(obj.vovels(places));;

    }

    public List<String> vovels(List<String> places) {

        List<String> placesFinal = new ArrayList<>();

        String str="";
        for(int i=0;i<places.size();i++)
        {
            str = places.get(i).toString();
            for(int j=0;j<str.length();j++)

                str= str.replaceAll("[aeiou]", "");
            placesFinal.add(str);

        }

         return placesFinal;
    }
}
