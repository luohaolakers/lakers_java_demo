package factory.simplefactory;

public class Driver {

    /**
     * 对象1
     *
     * @return
     */
    public static Benz createBenz() {
        return new Benz();
    }

    /**
     * 对象2
     *
     * @return
     */
    public static Bmw createBmw() {
        return new Bmw();
    }
}
