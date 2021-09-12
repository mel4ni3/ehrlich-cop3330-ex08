/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package org.example;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pplamt = 0, pizzaamt = 0, slices = 0, sliceres, pplslice, remainder;

        System.out.print("How many people? ");
        if (!s.hasNextInt()){
            System.out.print("Please enter a valid integer.");
            pplamt = s.nextInt();
        }
        pplamt = s.nextInt();

        System.out.print("How many pizzas do you have? ");
        if (!s.hasNextInt()){
            System.out.print("Please enter a valid integer.");
            pizzaamt = s.nextInt();
        }
        pizzaamt = s.nextInt();

        System.out.print("How many slices per pizza? ");

        if (!s.hasNextInt()){
            System.out.print("Please enter a valid integer.");
            slices = s.nextInt();
        }
        slices = s.nextInt();

        sliceres = pizzaamt * slices;
        System.out.println(pplamt + " people with " + pizzaamt + " pizzas (" + sliceres + " slices)");
        pplslice = sliceres / pplamt;

        if (pplslice == 1) {
            System.out.println("Each person gets " + pplslice + " piece of pizza.");
        }
        else{
            System.out.println("Each person gets " + pplslice + " pieces of pizza.");
        }
        remainder = sliceres % pplamt;
        System.out.print("There are " + remainder + " leftover pieces.");
    }
}