package factory.simplefactory;

public class BossSimplyFactory {

    /**
     * 简单工厂模式
     * https://blog.csdn.net/muttry/article/details/82840793/
     *
     * @param args
     */
    public static void main(String[] args) {
//        Driver driver = new Driver();
        Car c = Driver.createBmw();
        c.drive();
    }
}
