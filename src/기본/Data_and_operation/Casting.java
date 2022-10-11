package 기본.Data_and_operation;

public class Casting {

    public static void main(String[] args) {

        double a = 1.1;
        double b = 1; //1 -> 1.0 손실이 없음
        double b2 = (double) 1;
        System.out.println(b);

        //int c = 1.1;
        double d = 1.1;
        int e = (int) 1.1; // 1.1 -> 1 손실이 생김
        System.out.println(e);

        // 1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass()); // 문자열


    }

}
