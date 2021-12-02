package strategy;

/**
 * 策略模式
 * 如果每个店铺 mono 生成补货规则不一样的时候可以采取
 *
 * @param <T>
 */
public interface Mono<T> {

    void calculate(T t);
}
