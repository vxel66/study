package 기본.Baeakjoon.입출력_사칙연사;

import java.util.Scanner;

public class 곱셈 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        int[] arrayB = new int[3];
        for(int i=0; i<3; i++){
            arrayB[i]=Integer.parseInt(B.substring(i,i+1));
        }
        for(int i=2; i>-1; i--){
            System.out.println(arrayB[i]*Integer.parseInt(A));
        }
        System.out.println(Integer.parseInt(A)*Integer.parseInt(B));

        // 숏코딩
        int a = s.nextInt(), b = s.nextInt();
        System.out.print(b % 10 * a + " " + b / 10 % 10 * a + " " + b / 100 * a + " " + a * b);
    }

}
