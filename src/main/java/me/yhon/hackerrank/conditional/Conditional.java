package me.yhon.hackerrank.conditional;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Conditional {
    public void intro() {
        System.out.println("| -------------- HackerRank Challenge - Conditional -----------------|\n" +
                " -------------------------------------------------------------------- \n" +
                                  "Please type any number odd or even until 100, if your number is odd \n" +
                        "print weird, if your number is even and is in inclusive range of 2 to 5 \n" +
                        "print not Weird, if your number is in inclusive range of 6 to 20 print \n"+
                        "weird, and if your number is greater than 20 print not weird. \n"
        );
    }
    public void execute(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        solution(N);
    }

    public void solution(int N) {
        if (N % 2 == 1 || (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else if ((N >= 2 || N <= 5 ) || N >20) {
            System.out.println("Not Weird");
        }
    }
}

