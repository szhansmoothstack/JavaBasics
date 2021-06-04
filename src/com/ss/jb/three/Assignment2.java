package com.ss.jb.three;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Assignment2 {

    /**
     * Method to append a string to a specified file
     * @param appendStr the string to be appended
     * @param fileName the path to the file to append to
     */
    private static void append (String appendStr, String fileName){
        try{
            BufferedWriter writer = new BufferedWriter( (new FileWriter(fileName, true)));
            writer.write(appendStr);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the string you wish to append");
        String appendStr = scanner.nextLine();
        System.out.println("Enter path of file you wish to append to");
        String fileName = scanner.next();
        append(appendStr, fileName);
        scanner.close();
    }
}
