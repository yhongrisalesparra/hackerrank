package me.yhon.hackerrank;



import me.yhon.hackerrank.datatypes.DataTypes;
import me.yhon.hackerrank.helloworld.HelloWorld;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.showIntro();
        helloWorld.execute(scan);

        DataTypes dataTypes = new DataTypes();
        dataTypes.intro();
        dataTypes.execute(scan);
    }

}

