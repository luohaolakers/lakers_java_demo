package singleton;

/**
 * 单列模式
 */
public class Demo01 {


    private Demo01() {
    }

    private static class Demo01Holder {
        private static final Demo01 INSTANCE = new Demo01();
    }

    public static Demo01 getInstance() {
        return Demo01Holder.INSTANCE;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            new Thread(() -> {
                System.out.println(Demo01.getInstance().hashCode());
            }).start();
        }
    }
}
