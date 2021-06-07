package com.ss.jb.weekone;

public class Assignment1 {

    interface PerformOperation {
        boolean operate(int num);
    }

    private static PerformOperation isOdd() {
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

    public static void main(String[] args){
        System.out.println("is 3 odd: " + executeOp.op (isOdd(), 3));
        System.out.println("is 6 odd: " + executeOp.op (isOdd(), 6));

        System.out.println("is 5 prime: " + executeOp.op (isPrime(), 5));
        System.out.println("is 9 prime: " + executeOp.op (isPrime(), 9));

        System.out.println("is 125521 a palindrome: " + executeOp.op (isPalindrome(), 125521));
        System.out.println("is 125522 a palindrome: " + executeOp.op (isPalindrome(), 125522));
    }

}
