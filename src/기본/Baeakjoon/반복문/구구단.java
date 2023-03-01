package 기본.Baeakjoon.반복문;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
