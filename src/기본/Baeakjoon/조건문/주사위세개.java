package 기본.Baeakjoon.조건문;

import java.util.Scanner;

public class 주사위세개 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] xyz = {s.nextInt(),s.nextInt(),s.nextInt()};
        int ex=0;
        int num=0;
        int same=0;
        int samenum = 0;

        while(num<xyz.length-1) {
            ex = xyz[num];
            for(int j=num+1; j<xyz.length; j++){
                if(ex==xyz[j]){
                    samenum = xyz[j];
                    same++;
                }
            }
            num++;
        }
        int max =0;
        for(int i=0; i<xyz.length; i++){
            if(max<xyz[i]){
                max = xyz[i];
            }
        }
        if(same>1){
            System.out.println(10000+(samenum*1000));
        }else if(same==1){
            System.out.println(1000+(samenum*100));
        }else{
            System.out.println(max*100);
        }

    }

}
