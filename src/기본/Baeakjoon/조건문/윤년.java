package 기본.Baeakjoon.조건문;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        if(X%4==0 && X%100!=0 || X%400==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
