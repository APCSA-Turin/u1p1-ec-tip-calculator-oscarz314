package com.example.project;
import java.util.Scanner;
import java.util.ArrayList;
//I learned Math.round from https://www.w3schools.com/java/ref_math_round.asp
//I learned arraylist from https://www.w3schools.com/java/java_arraylist.asp  
//Could of just concated the strings but wanted to learn about lists and arrays


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 

        double tipPercentage = (percent / 100.0);
        double costTotal = (cost + (cost * tipPercentage));
        double tipTotal = (costTotal - cost);

        // Person costs
        double personBaseCost = (cost / people);
        double personTipCost = (tipTotal / people);
        double personTotalCost = (costTotal / people);

        //I learned Math.round from https://www.w3schools.com/java/ref_math_round.asp
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + ((Math.round(cost * 100)) / 100.0) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + ((Math.round(tipTotal * 100)) / 100.0) + "\n");
        result.append("Total Bill with tip: $" + ((Math.round(costTotal * 100)) / 100.0) + "\n");
        result.append("Per person cost before tip: $" + ((Math.round(personBaseCost * 100)) / 100.0) + "\n");
        result.append("Tip per person: $" + ((Math.round(personTipCost * 100)) / 100.0) + "\n");
        result.append("Total cost per person: $" + ((Math.round(personTotalCost * 100)) / 100.0) + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = ""; 

        //Your scanner object and while loop should go here
        //I learned arraylist from https://www.w3schools.com/java/java_arraylist.asp  
        ArrayList<String> itemsList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "";
        
        // Input 
        System.out.println("Enter an item name or type '-1' to finish: ");
        input = scan.nextLine();

        while(!input.equals("-1")){
            System.out.println("Enter an item name or type '-1' to finish: ");
            itemsList.add(input);
            input = scan.nextLine();
        }
    
        // Pour list into string
        for (int i = 0; i < itemsList.size(); i++){
            items += itemsList.get(i) + "\n";
        }

        System.out.println(calculateTip(people,percent,cost,items));
        scan.close();
    }
}
