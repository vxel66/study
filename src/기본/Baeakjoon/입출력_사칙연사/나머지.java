package 기본.Baeakjoon.입출력_사칙연사;

import java.util.Scanner;

public class 나머지 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] ex = input.split(" ");
        int A = Integer.parseInt(ex[0]);
        int B = Integer.parseInt(ex[1]);
        int C = Integer.parseInt(ex[2]);
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println( ((A%C) * (B%C))%C);
    }
}
