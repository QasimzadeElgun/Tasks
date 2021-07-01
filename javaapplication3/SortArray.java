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
 * @author Elgun
 */
public class SortArray {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,6,6,8,9,10,10,10,12,12);
           //First Method
        //System.out.println(SortArray(list));
           //Second Method
        System.out.println(SortArray2(list));
    }

    //First Method
//    public static List<Integer> SortArray(List<Integer> list) {
//        List<Integer> returnElement = new ArrayList<>();
//        for (int i : list) {
//            if (!returnElement.contains(i)) {
//                returnElement.add(i);
//            }
//        }
//        return returnElement;
//    }

    //Second Method
    public static List<Integer> SortArray2(List<Integer> list) {
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
