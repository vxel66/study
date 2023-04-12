package 기본.Baeakjoon.별찍기;

public class 별3 {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            for(int j=4; j>0; j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
