package singleton;

public class Demo01 {


    private static final Demo01 INSTANCE = new Demo01();

    private Demo01() {
    }

    public static Demo01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        Demo01 demo02 = new Demo01();
        System.out.print(demo01 == demo02);

    }
}
