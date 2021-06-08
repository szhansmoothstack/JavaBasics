package com.ss.jb.weekone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Assignment1 {

    interface PerformOperation {
        boolean operate(int num);
    }

    static PerformOperation isOdd() {
        //return a -> (a % 2 != 0) ? true : false;
        return x -> x % 2 != 0;
    }

    private static PerformOperation isPrime() {
        return x -> {
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    private static PerformOperation isPalindrome (){
        return x -> x == Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
    }

    static class executeOp {
        public static boolean op (PerformOperation p, int num) {
            return p.operate(num);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        String output = "";
        while (input --> 0){
            String line = reader.readLine().trim();
            StringTokenizer tokenizer = new StringTokenizer(line);
            int op = Integer.parseInt(tokenizer.nextToken());
            int num = Integer.parseInt(tokenizer.nextToken());
            if (op == 1) output = executeOp.op (isOdd(), num)? "ODD":"EVEN";
            else if (op == 2) output = executeOp.op (isPrime(), num)? "PRIME":"COMPOSITE";
            else if (op == 3) output = executeOp.op (isPalindrome(), num)? "PALINDROME":"NOT PALINDROME";
            System.out.println(output);
        }
    }

    public static class Assignment1TestHook{
        public boolean isOdd(int num){
            return executeOp.op(Assignment1.isOdd(), num);
        }

        public boolean isPrime(int num){
            return executeOp.op(Assignment1.isPrime(), num);
        }

        public boolean isPalindrome (int num){
            return executeOp.op(Assignment1.isPalindrome(), num);
        }
    }

}
