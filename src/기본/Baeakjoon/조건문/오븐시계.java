package 기본.Baeakjoon.조건문;

import java.util.Scanner;

public class 오븐시계 {
    public static void main(String[] args) {

        //1,440
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt()+s.nextInt();

        if(h*60+m<1440){
            System.out.println((h*60+m)/60+" "+(h*60+m)%60);
        }else{
            System.out.println(((h*60+m)-1440)/60+" "+(h*60+m)%60);
        }

        //숏코딩

        System.out.print((h+m/60)%24+" "+m%60);

    }
}
