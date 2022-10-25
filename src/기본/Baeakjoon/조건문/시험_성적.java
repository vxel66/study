package 기본.Baeakjoon.조건문;

import java.util.Scanner;

public class 시험_성적 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a>=90){
            System.out.println("A");
        }else if(a>=80){
            System.out.println("B");
        }else if(a>=70){
            System.out.println("C");
        }else if(a>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }

        //숏코딩
        System.out.print("FFFFFFDCBAA".charAt(s.nextInt() / 10));
    }
}
