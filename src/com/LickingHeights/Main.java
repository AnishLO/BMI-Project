package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare
        String name;
        float inches;
        float meter;
        float kilograms;
        float pound;
        float total;

        Scanner keyboard;


        //Initializing
        keyboard = new Scanner(System.in);

        System.out.println("what is your name?");
        name = keyboard.nextLine();
        System.out.println("what is your height only in (inches)?");
        inches = keyboard.nextInt();
        meter = inches *(0.02456f);
        System.out.println("what is your weight only in (pound)?");
        pound = keyboard.nextInt();
        kilograms = pound *(0.453592f);












    }
}
