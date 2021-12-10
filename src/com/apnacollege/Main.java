package com.apnacollege;
import java.lang.Math ;
import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System .in) ;
        System.out.println("enter first term(a),common ratio(r) & nth term(any term of the GP you want to know like 10th term)");
        int a=s.nextInt() ;
        int r=s.nextInt() ;
        int N=s.nextInt() ;
        int n=a*(int)(Math.pow(r,N-1) );
        System.out.println(n);
	// write your code here
    }
}
