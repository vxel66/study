package 기본.ProjectOOP;

import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {

    public static void main(String[] args) throws IOException {
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));

        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" Java1");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();


    }

}
