package Java设计模式.状态模式;

/**
 * @Auther: liushuo
 * @Description: 状态抽象类 (核心类)
 * @version: 1.0
 */
public abstract class State {

    //1.扣除积分方法 -50积分才能抽奖
    public abstract void deductMoney();

    //2.是否抽中奖品
    public abstract boolean raffle();

    //3.发放奖品
    public abstract void dispensePrize();



}
