/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author eqasm
 */
public class PercentageElements {

 

     public static void main(String[] args) {
 
         int upper = 0;
         int lower = 0;
         int spaces = 0;
         int digit = 0;
         int other = 0;
         int size = 0;
 
 
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter characters that you want to get percentage of them : ");
         String name = scanner.nextLine();
 
 
         char[] myCharacters = name.toCharArray();
 
        
 
         for (char c : myCharacters){
 
             if (Character.isUpperCase(c)){
                 upper++;
             }else if (Character.isLowerCase(c)){
                 lower++;
             }else  if (Character.isDigit(c)){
                 digit++;
             }else if (Character.isSpaceChar(c)){
                 spaces++;
             }else{
                 other++;
             }
 
         }
         size = name.length();
         System.out.println("Number of Uppercase letters :"  +upper+" Percentage of Uppercase letters :"+ ((upper * 100) / size) + "%");
         System.out.println("Number of Lowercase letters :"  +lower+" Percentage of Lowercase letters :"+  ((lower * 100) / size) + "%");
         System.out.println("Number of Digits letters :"  +digit+" Percentage of Digits letters :"+  ((digit * 100) / size) + "%");
         System.out.println("Number of Special characters :"  +(spaces+other)+" Percentage of lowSpecialercase letters :"+  (((spaces+other) * 100) / size) + "%");
 
 
     }
 
 
 
 
}
