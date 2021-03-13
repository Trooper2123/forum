package trooper2123.br.com.daysofcode.day;

import java.util.Scanner;


//Task
//        Given the meal price (base cost of a meal),
//        tip percent (the percentage of the meal price being added as tip),
//        and tax percent (the percentage of the meal price being added as tax)
//        for a meal, find and print the meal's total cost. Round the result to the nearest integer.


public class Day2 {
    private double mealCost;
    private double tipPercent;
    private double taxPercent;

    public void Menu(Day2 day2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the meal cost");
        day2.mealCost = scanner.nextDouble();
        System.out.println("Insert the tip percent");
        day2.tipPercent = scanner.nextDouble();
        System.out.println("Insert the tax percent");
        day2.taxPercent = scanner.nextDouble();

        System.out.println((mealTotal(mealCost, totalTip(mealCost, tipPercent), totalTax(mealCost, taxPercent))));
    }

    private double mealTotal(double mealCost, double totalTip, double totalTax) {
        double meal = Math.round(mealCost + totalTip + totalTax);
        return meal;
    }

    private Double totalTax(double mealCost, double taxPercent){
        double tax = mealCost * (taxPercent/100);
        return tax;

    }

    private  Double totalTip(double mealCost, double tipPercent){
        double tip = mealCost *(tipPercent/100);
        return tip;
    }

    public static void main(String[] args) {
        Day2 day2 = new Day2();
        day2.Menu(day2);
    }
}


