package com.apnacollege;
import java.util.Scanner ;
public class leapYear {
      static int LeapYear(int year){
        if(year%100==0 && year%400==0){
            System.out.println("is leap year");
            return 1;
        }else if(year%4==0 && year%100==0){
            System.out.println("not leap year");
            return 0;
        }else if(year%4==0){
            System.out.println("is leap year");
            return 1;
        }else
            System.out.println("not leap year");
            return 0;
//enter your code here
    }
    public static void main(String []args){
          Scanner s=new Scanner(System .in);
        System.out.println("enter any year between 1 & 5000");
        LeapYear(s.nextInt() );
    }
}
