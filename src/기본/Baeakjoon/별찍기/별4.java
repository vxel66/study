package 기본.Baeakjoon.별찍기;

public class 별4 {

    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0;j<3-i; j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");


        }
    }

}
