package com.apnacollege;

public class pattern3 {
    public static void main(String args[]) {
//i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, row = 6;
//Outer loop work for rows
        for (i = 0; i < row; i++) {
//inner loop work for space
            for (j =(row - i); j >= 0; j--) {  //this for loop prints 7 spaces in 1st iteration.
//prints space between two stars                        // 6 spaces in 2nd iteration.
                System.out.print(" ");              // 5 spaces in 3rd iteration.
            }
//inner loop for columns
            for (j = 0; j <= i; j++) { //this for loop prints 1 star in 1st iteration.
//prints star                              // 2 stars in 2nd iteration.
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}

