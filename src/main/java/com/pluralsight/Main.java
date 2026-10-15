package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double sandwichPrice = 0;

        System.out.print("Enter Sandwich size, 1(regular) 0r 2(large): ");
        int sandwichSize = reader.nextInt();

        reader.nextLine();

        if(sandwichSize == 1){
            sandwichPrice= 5.45;
        } else if(sandwichSize != 1 && sandwichSize !=2){
            System.out.println("Invalid size!");
            return;
        }else {
            sandwichPrice = 8.95;
        }

        double regularLoaded = 1.00;
        double largeLoaded = 1.75;
        String answerOne = "yes";
       // String answerTwo = "no";

        System.out.print("Would you like the sandwich loaded?: ");
        String loadedSandwich = reader.nextLine();


        if (answerOne.equals(loadedSandwich) && sandwichSize == 1){
           sandwichPrice = sandwichPrice + regularLoaded;
        }else if(answerOne.equals(loadedSandwich) && sandwichSize ==2){
            sandwichPrice = sandwichPrice + largeLoaded;

        }else{
            System.out.println("Loaded option not selected.");
        }



        double studentDiscount = 0.10;
        double seniorDiscount = 0.20;

        System.out.print("Enter your age: ");
        int customerAge = reader.nextInt();

        double newPrice = 0;

//what about other inputs? 3,4,5,6

        if (customerAge <= 17) {
              newPrice = sandwichPrice - (sandwichPrice*studentDiscount);
        }else if(customerAge >=65) {
              newPrice = sandwichPrice - (sandwichPrice*seniorDiscount);
        }else{
            newPrice = sandwichPrice;
            System.out.println("Discount not applied.");
        }


        System.out.println("The total for your sandwich is: " + " $" + newPrice);

        reader.close();



        }


    }

