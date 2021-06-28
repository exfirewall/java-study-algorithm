package com.company.study.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Ch01Main {
    public static void main(String[] args) throws IOException {
        Student st1 = new Student("jae1", 12);
        Student st2 = new Student("jae2", 13);
        Student st3 = new Student("jae3", 14);
        System.out.println("학생이 생성되었습니다.");
        ArrayList<Student> stdList = new ArrayList<>();

        stdList.add(st1);
        stdList.add(st2);
        stdList.add(st3);

        for (int i=0;i<stdList.size(); i++){
            System.out.println("학생 " + i+1 + " 이름 : " + stdList.get(i).getName() + " 나이 : " + stdList.get(i).getAge());
        }

        System.out.println("검색을 시작합니다.");
        while (true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("검색하고자하는 이름을 입력하세요 : ");
            String s = br.readLine();
            if (!s.equals("n")){
                for (Student std : stdList) {
                    if (s.equals(std.getName())) {
                        System.out.println("찾았습니다");
                        System.out.println("이름 :" + std.getName() + " 나이 : " + std.getAge());
                        break;
                    }
                }
            }
            else{
                break;
            }
        }
    }
}
