package strategy;

public class PingAnShop implements Mono<PingAnShop> {


    @Override
    public void calculate(PingAnShop pingAnShop) {
        System.out.println("PingAn mono");
    }

}
