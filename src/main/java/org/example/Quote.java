package org.example;

import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jorge Quiros
 */

public class Quote
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.println( "What is the quote?" );
        String quote= input.nextLine();
        Scanner person=new Scanner(System.in);
        System.out.println( "Who said the quote?" );
        String famous= person.nextLine();
        System.out.println(famous + " says," + "\"" + quote + "\"");
    }
}
