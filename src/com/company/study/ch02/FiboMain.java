package com.company.study.ch02;

public class FiboMain {
    public static void main(String[] args) {
        int[] arr = new int[100];

        arr[0] = 1;
        arr[1] = 1;

        for (int i=2; i<10; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<10; i++){
            stringBuilder.append(arr[i]+" ");
        }
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(0,stringBuilder.capacity());

        int first = 1;
        int second = 1;
        for (int i=2; i<10; i++){
            int res = first + second;
            first = second;
            second = res;
            stringBuilder.append(res+" ");
        }
        System.out.println(stringBuilder.toString());
        stringBuilder.setLength(0);
        System.out.println(stringBuilder.toString());
    }
}
