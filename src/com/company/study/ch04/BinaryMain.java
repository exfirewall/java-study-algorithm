package com.company.study.ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinaryMain {
    public static void main(String[] args) {
        int decimal = 19;
        int[] binary = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(decimal>0){
            arrayList.add(decimal % 2);
            decimal = decimal / 2;
            System.out.println(decimal);
        }
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
