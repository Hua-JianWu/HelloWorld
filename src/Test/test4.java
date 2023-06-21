package Test;

abstract class Base {

}

public class test4 extends Base{
    public static void main(String[] args) {
        Base obj = new test4();
        System.out.println(obj.getClass().getName());
        System.out.println(Base.class.getName());
    }
}

