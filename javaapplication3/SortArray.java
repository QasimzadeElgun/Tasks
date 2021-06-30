/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.List;
 
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Collections;
 import java.util.List;

/**
 *
 * @author eqasm
 */
public class SortArray {
   
 
 
     public static void main(String[] args) {
 
 
         List<Integer> list = Arrays.asList(1,1,1,2,2,2,3,3,1,3,4,4,5,6,45,6,4,7,5,2,7,8,5,27,78,2,4);
 
         System.out.println(returnUniqueSortedArray2(list));
 
     }
 
 
     public static List<Integer> returnUniqueSortedArray(List<Integer> list) {
         List<Integer> returnElement = new ArrayList<>();
         for (int i : list) {
             if (!returnElement.contains(i)) {
                 returnElement.add(i);
             }
         }
         return returnElement;
     }
 
 
     public static List<Integer> returnUniqueSortedArray2(List<Integer> list) {
         List<Integer> returnElement = new ArrayList<>();
 
         for (int i : list) {
             int counter = 0;
             for (int j = 0; j < returnElement.size(); j++) {
                 if (returnElement.get(j) == i) {
                     counter++;
                 }
             }
             if (counter == 0) {
                 returnElement.add(i);
             }
 
         }
         Collections.sort(returnElement);
         return returnElement;
 
     }
 
 
 }

