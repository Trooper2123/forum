package trooper2123.br.com.daysofcode.day;

import java.util.Scanner;


//Task
//        Declare  variables: one of type int, one of type double, and one of type String.
//        Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
//        Use the  operator to perform the following operations:
//        Print the sum of  plus your int variable on a new line.
//        Print the sum of  plus your double variable to a scale of one decimal place on a new line.
//        Concatenate  with the string you read as input and print the result on a new line.

public class Day1 {

    private Integer integer;
    private double aDouble;
    private String something;

    public void Menu(Day1 day1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a integer");
        day1.integer = scanner.nextInt();
        System.out.println("Insert a double");
        day1.aDouble = scanner.nextDouble();
        System.out.println("Insert a some thing");
        day1.something = scanner.next();

        System.out.println(integerSum(integer, aDouble));
        System.out.println(doubleSum(aDouble));
        System.out.println(something);

    }

    private Integer integerSum(Integer integer, Double aDouble) {
        Integer sumInteger;
        sumInteger = integer + aDouble.intValue();

        return sumInteger;
    }

    private double doubleSum(double aDouble) {
        double sumDouble;
        sumDouble = aDouble * 2;

        return sumDouble;
    }

    public static void main(String[] args) {
        Day1 day = new Day1();
        day.Menu(day);
    }
}
