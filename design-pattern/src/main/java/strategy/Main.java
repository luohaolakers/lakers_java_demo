package strategy;

public class Main {
    public static void main(String[] args) {

        //计算总方法
        CalculateOrder calculateOrder = new CalculateOrder();

        //策略对象1
        JdShop jdShop = new JdShop();
        calculateOrder.run(jdShop);

        //策略对象2
        PingAnShop pingAnShop = new PingAnShop();
        calculateOrder.run(pingAnShop);

        //策略对象3
        TmalKidsShop tmalKidsShop = new TmalKidsShop();
        calculateOrder.run(tmalKidsShop);

        //策略对象4
        TmallShop TmallShop = new TmallShop();
        calculateOrder.run(TmallShop);

        //未来需要新的店铺补货场景 新添加class 实现Mono 接口 或者新类继承 DefaultMono
    }
}
