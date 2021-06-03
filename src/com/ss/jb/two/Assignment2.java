package com.ss.jb.two;

import java.util.Arrays;
import java.util.Random;

public class Assignment2 {

    /**
     * Returns a 2D array of up to 10 rows and 10 columns (dimensions generated randomly)
     * filled with random numbers from 1 - 100
     * @return a 2D array of random Integers
     */
    private static Integer[][] construct2DArray (){
        //number generator
        Random generator = new Random();

        //instantiates a 2D array of random dimensions up to 10 rows and 10 columns
        Integer[][] arr = new Integer[generator.nextInt(10) + 1][generator.nextInt(10) + 1];

        //fills the array with randoms numbers 1 - 100
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j ++)
                arr[i][j]= generator.nextInt(99) + 1;
        }
        return arr;
    }

    /**
     * prints a 2D array
     * @param arr the array to be printed
     */
    private static void print2DArray (Integer[][] arr){
        for (Integer[] rowArr : arr){
            System.out.println(Arrays.toString(rowArr));
        }
    }

    public static void main (String[] args){
        Integer[][] arr = construct2DArray();

        int maxRow = 0;
        int maxCol = 0;
        Integer maxVal = Integer.MIN_VALUE;

        //loops the array once to find the maximum value and index
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j ++){
                if (arr[i][j] > maxVal){
                    maxRow = i;
                    maxCol = j;
                    maxVal = arr[i][j];
                }
            }
        }
        print2DArray(arr);
        System.out.println("Max value: " + maxVal + "\n Row: " + maxRow + "\n Col: " + maxCol);
    }
}
