package com.company.study.ch07;

public class Factorial {
    public static int factorial(int n){
        if (n==1) return 1;
        else{
            return factorial(n-1)*n;
        }
    }
    public static void main(String[] args) {
        int num = 5;

        System.out.println(factorial(num));
    }
}
