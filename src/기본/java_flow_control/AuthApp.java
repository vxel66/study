package 기본.java_flow_control;

public class AuthApp {

    public static void main(String[] args) {

        String id = "egoing";
        String inputid ="egoing";

        String password = "1111";
        String inputpass ="1111";

        if(inputid.equals(id) && password.equals(inputpass)){
            System.out.println("Master!");
        }else{
            System.out.println("Who are you?");
        }

    }

}
