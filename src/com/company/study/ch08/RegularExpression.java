package com.company.study.ch08;

import java.util.Locale;

public class RegularExpression {
    public String solution(String new_id){
        String answer = new_id;
        //1단계
        answer = answer.toLowerCase(Locale.ROOT);
        answer = answer.replaceAll("[^a-zA-Z0-9-_.]","");
        answer = answer.replaceAll("\\.{2,}",".");
        answer = answer.replaceAll("^[.]|[.]$","");
        if (answer.equals("")){
            answer += "a";
        }
        if (answer.length()>=16){
            answer=answer.substring(0,15);
        }
        answer=answer.replaceAll("[.]$","");
        if(answer.length()<=2){
            while(answer.length()<3){
                answer+=answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RegularExpression regularExpression = new RegularExpression();
        String ans = regularExpression.solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(ans);
    }
}
