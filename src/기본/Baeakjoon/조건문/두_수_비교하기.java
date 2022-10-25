package 기본.Baeakjoon.조건문;

import java.util.Scanner;

public class 두_수_비교하기 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] array = input.split(" ");
        if(Integer.parseInt(array[0])>Integer.parseInt(array[1])){
            System.out.println(">");
        }else if(Integer.parseInt(array[0])<Integer.parseInt(array[1])){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
