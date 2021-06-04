package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment3 {

    private static Integer countAppearances (String fileName, char c){
        int count = 0;

        try{
            FileInputStream inputStream = new FileInputStream(fileName);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( dataInputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                int index = line.indexOf(c);
                while (index != -1){
                    count ++;
                    index = line.indexOf (c, index + 1);
                }
            }
            dataInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter path of file");
        String dir = scanner.nextLine();
        System.out.println("Enter the character you want to count (first character will be taken, case sensitive)");
        char character = scanner.next().charAt(0);
        scanner.close();
        System.out.println(countAppearances(dir, character));
    }
}
