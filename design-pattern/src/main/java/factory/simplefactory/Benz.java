package factory.simplefactory;

public class Benz extends Car {

    public Benz() {
        this.setName("Benz");
    }

    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------");
    }
}
