package strategy;

public class DefaultMono extends DefaultAbstractMono implements Mono<Object> {

    public void calculate(Object t) {
        System.out.println("公共mono----" + toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
