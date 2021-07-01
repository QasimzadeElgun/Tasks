/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author eqasm
 */
public class PercentageElements {

    public static void main(String[] args) {

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int other = 0;
        int size = 0;

        //Dynamic Code(if you want, you can run this code for dynamic results.
              //Scanner scanner = new Scanner(System.in);
              //System.out.println("Please enter characters that you want to get percentage of them : ");
              //String name = scanner.nextLine();
        //Static code
        String name = "Tiger Runs @ The Speed Of 100 km/hour.";
        char[] myCharacters = name.toCharArray();

        for (char c : myCharacters) {

            if (Character.isUpperCase(c)) {
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;
            } else if (Character.isDigit(c)) {
                digit++;
            } else {
                other++;
            }

        }
        size = name.length();
        NumberFormat formatter = new DecimalFormat("#0.00");
        String upperPercantage = formatter.format(((double) (upper * 100) / size));
        String lowerPercantage = formatter.format(((double) (lower * 100) / size));
        String digitPercantage = formatter.format(((double) (digit * 100) / size));
        String othersPercantage = formatter.format(((double) (other * 100) / size));

        System.out.println("Number of uppercase letters is " + upper + ". " + "So percentage is " + upperPercantage + "%");
        System.out.println("Number of lowercase letters is " + lower + ". " + "So percentage is " + lowerPercantage + "%");
        System.out.println("Number of digits is " + digit + ". " + "So percentage is " + digitPercantage + "%");
        System.out.println("Number of other characters is " + other + ". " + "So percentage is " + othersPercantage + "%");

    }

}
