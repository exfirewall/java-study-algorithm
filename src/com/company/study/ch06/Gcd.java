package com.company.study.ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Gcd {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static int gcd2(int a, int b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);

        return gcd.intValue();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int ans1 = gcd(a,b);
        int ans2 = gcd2(a,b);

        System.out.println(ans1 + " " + ans2);
    }
}
