package com.company.study.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModeMain {
    public static void main(String[] args) throws IOException {
        int[] inputArr = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("start");
        for (int i=0; i<10; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("end");
        br.close();
        int[] mode = new int[10];
        int i=0;
        int ans=0;
        int max=-21460000;
        System.out.println(inputArr.length);
        while (i<inputArr.length) {
            mode[inputArr[i]]++;
            i++;
        }
        i=0;
        while (i<inputArr.length){
            if(max<mode[i]){
                max=mode[i];
                ans=i;
            }
            i++;
        }
        System.out.println(ans);
    }
}
