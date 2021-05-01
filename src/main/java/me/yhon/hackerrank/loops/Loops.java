package me.yhon.hackerrank.loops;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Loops {
    public void intro() {
        System.out.println(
            """
                 ---------------- HackerRank Challenge - Loops -------------------|
                 -------------------------------------------------------------------
                Type any integer, print its first 10 multiples, the program is like 
                multiplication tables enter a number n and multiply it up to 10               
            """
        );
        System.out.print("Please type any number: ");

    }

    public void execute(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 1; i <= 10; i++){
            System.out.println( n + " x " + i + " = " + n * i );
        }

    }
}


