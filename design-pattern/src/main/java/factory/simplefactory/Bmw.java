package factory.simplefactory;

public class Bmw extends Car {

    public Bmw(){
        this.setName("Bmw");
    }

    @Override
    public void drive() {
        System.out.println(this.getName() + "----go-----------------------");
    }
}
