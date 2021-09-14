/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        String usersName;


        System.out.print("What is your name? ");
        usersName = stdin.nextLine();


        System.out.println("Hello, " + usersName + ", nice to meet you!");

    }
}
