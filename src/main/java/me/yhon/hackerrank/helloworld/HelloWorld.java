package me.yhon.hackerrank.helloworld;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HelloWorld {

    public void showIntro() {
        System.out.println(
            "| ----------- HackerRank Challenge - Hello World -----------|\n" +
            " ------------------------------------------------------------ \n" +
            " Please type any sentence, then this will be concatenated to  \n" +
            " a \"Hello World\" sentence:  \n"
        );
    }

    public void execute(Scanner scan) {
        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        System.out.println(inputString);
    }
}

