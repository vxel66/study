package 기본.ProjectOOP;

public class MyOOP2 {
    public static void main(String[] args) {
        Print p1 = new Print();
        p1.delimiter = "----";
        //..
        p1.A();
        p1.B();
        //..
        Print p2 = new Print();
        p2.delimiter = "****";

        p2.A();
        p2.B();

        p1.A();
        p1.B();
        p2.A();
        p2.B();
    }
}
