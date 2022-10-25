package 기본.Baeakjoon.조건문;

import java.util.Scanner;

public class 알람시계 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();

        if(h==0 && m>=45){
            System.out.println("0 "+(m-45));
        }
        else if(h==0 ){
            System.out.println("23 "+(m+15));
        }
        else if(m>=45){
            System.out.println(h+" "+(m-45));
        }
        else if(m<45){
            System.out.println(h-1+" "+(m+15));
        }

        //숏코딩
        int H = 60 * s.nextInt() + s.nextInt() + 1395;
        System.out.print(H / 60 % 24 + " " + H % 60);
}
}
