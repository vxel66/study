package 기본.Baeakjoon;

import java.util.*;

interface Main {
    static void main(String[] z) {
        Scanner s = new Scanner(System.in);
        int h = 60 * s.nextInt() + s.nextInt() + 1395;
        System.out.print(h / 60 % 24 + " " + h % 60);
    }
}