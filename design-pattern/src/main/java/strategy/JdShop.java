package strategy;

public class JdShop implements Mono<JdShop> {

    @Override
    public void calculate(JdShop shop) {
        System.out.println("Jd mono");
    }
}
