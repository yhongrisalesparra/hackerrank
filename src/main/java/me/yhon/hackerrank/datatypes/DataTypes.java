package me.yhon.hackerrank.datatypes;

import java.util.Scanner;

public class DataTypes {

    public void intro() {
        System.out.println("| ----------- HackerRank Challenge - Data types ------------|\n" +
                " ------------------------------------------------------------   \n" +
                " Please type any integer number then any double number to make   \n" +
                "      a sum of its numbers and the fixed variables and finally   \n" +
                "      write a sentence to autocomplete the hackerrank sentence \n"
        );
    }

    public void execute(Scanner scan) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        /* Declare second integer, double, and String variables. */
        int x;
        double y;
        String z;

        /* Read and save an integer, double, and String to your variables.*/
        x = scan.nextInt();
        y = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        /* Print the sum of the double variables on a new line. */
        System.out.println(i + x);
        System.out.println(d + y);
        /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */
        System.out.println(s + z);
    }
    public void showIntro () {

    }
}
