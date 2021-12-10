package com.apnacollege;
import java.util.Scanner ;
public class array {
    public static void main(String []args){
        Scanner s=new Scanner(System .in);
        System.out.println("enter n and elements in array");
        int N=s.nextInt() ;
        int arr[]=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=s.nextInt() ;
        }
        int sum=0;
        for(int i=0;i<N;i++){
            sum=sum+arr[i];
        }
        System.out.print("sum is:  "+sum);
        System.out.print(" average is: "+sum/N);
        //Enter your code here
    }
   }
