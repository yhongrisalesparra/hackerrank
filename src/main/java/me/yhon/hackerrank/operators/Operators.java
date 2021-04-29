package me.yhon.hackerrank.operators;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Operators {
    public void intro() {
        System.out.println("| -------------- HackerRank Challenge - Operators -----------------|\n" +
                " ------------------------------------------------------------------ \n" +
                " Please type any double number to make a cost of meal and then any int \n" +
                " number to make a percentage of tip and finally type a percentage of  \n" +
                " tax, the total coast of the meal will be the sum of the percentage of \n" +
                " the tip plus the percentage of the tax plus the cost of the meal.  \n"

        );
    }

    public void execute(Scanner scanner) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);
    }

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost*tip_percent/100;
        double tax = meal_cost*tax_percent/100;
        double total_cost = meal_cost + tip + tax;
        System.out.println(Math.round(total_cost));
    }
}


