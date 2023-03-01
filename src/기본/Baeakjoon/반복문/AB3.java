package 기본.Baeakjoon.반복문;

import java.util.Scanner;

public class AB3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        s.nextLine();
        for(int i = 0; i < T; i++){
            String ca = s.nextLine();
            String answer[] = ca.split(" ");
            System.out.println(Integer.parseInt(answer[0])+Integer.parseInt(answer[1]));
        }
    }
}
