package 기본.ProjectMethod;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    public static void main(String[] args) throws IOException {

        pringTwoTimesA("b","-");
        System.out.println(twoTimes("a","-"));

        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a","+"));
        fw.close();


    }

    public  static String twoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter +"\n";
        out = out + text + "\n";
        return out;
    }

    public static void pringTwoTimesA(String text,String delimiter){
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

}
