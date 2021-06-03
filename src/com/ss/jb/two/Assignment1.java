package com.ss.jb.two;

public class Assignment1 {

    /**
     * Checks if a string can be parsed as an Integer
     * @param str the string to be checked
     * @return whether the string can be parsed as an Integer
     */
    private static Boolean isInteger (String str){
        try {
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void main (String[] args){
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        //loop through the arguments
        for (String str : args){
            //adds to sum if it is an integer
            if (isInteger(str)){
                sum += Integer.parseInt(str);
            }
            //append to string otherwise
            else{
                sb.append(str);
            }
        }
        System.out.println("Sum of integers inputs: " + sum);
        System.out.println("Combination of non integer inputs: " + sb.toString());
    }
}
