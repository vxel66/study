package 기본.Baeakjoon.반복문;

import java.util.Scanner;

public class 합 {

    public static void main(String[] args) {
        Scanner s  =  new Scanner(System.in);
        int n = s.nextInt();
        int answer =0;
        for(int i=1; i<=n; i++){
            answer= answer +i;
        }
        System.out.println(answer);
    }
}
