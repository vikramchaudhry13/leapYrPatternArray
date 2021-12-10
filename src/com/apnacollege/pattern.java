package com.apnacollege;
import java.util.* ;
public class pattern {
    public static void main(String []args){
        Scanner s=new Scanner(System .in);
        System.out.println("enter the value of n");
        int n=s.nextInt() ;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
