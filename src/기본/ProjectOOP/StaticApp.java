package 기본.ProjectOOP;

class Foo{
    public static String classVar = "I classs var";
    public String instanceVar = "I instance var";
    public static void classMethod(){
        System.out.println(classVar);       // Ok
    //    System.out.println(instanceVar);    // Eroor
    }
    public void instanceMethod(){
        System.out.println(classVar);       // OK
        System.out.println(instanceVar);    // Eroor
    }
}

public class StaticApp {

    public static void main(String[] args) {
        System.out.println(Foo.classVar);       // Ok
    //    System.out.println(Foo.instanceVar);    // Eroor
        Foo.classMethod();
    //    Foo.instanceMethod();
        Foo f1 = new Foo();
        String a1 = f1.instanceVar;
        String a2 = f1.classVar;
        System.out.println(a1);
        System.out.println(a2);
    }

}
