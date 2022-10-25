package 기본.Baeakjoon.입출력_사칙연사;

import java.util.Scanner;

public class 체스판_확인 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String input = s.nextLine(); //Hello Java
        String[] array = input.split(" ");
        int[] ex = {1,1,2,2,2,8};
        for(int i = 0; i < array.length; i++) {
            System.out.print(ex[i]-Integer.parseInt(array[i])+" ");
        }
    }
}
