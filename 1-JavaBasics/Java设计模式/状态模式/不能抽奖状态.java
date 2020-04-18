//package Java设计模式.状态模式;
//
///**
// * @Auther: liushuo
// * @Description: 不能抽奖状态
// * @version: 1.0
// */
////具体的状态子类
//public class 不能抽奖状态 extends State {
//
//    //初始化时传入活动引用,扣除积分后改变其状态
//    RaffleActivity activity;
//
//    //初始化时传入活动引用,扣除积分后改变其状态
//    //构造方法
//    public 不能抽奖状态(RaffleActivity activity){
//        this.activity=activity;
//    }
//
//    //不能抽奖状态,可以扣积分,将状态设置成可以抽奖状态
//    @Override
//    public void deductMoney() {
//
//        System.out.println("扣除50积分成功,您可以抽奖了");
//        activity.setState(activity.getCanRaffleState());
//    }
//
//    //当前状态不能抽奖,要先扣积分才能抽奖
//    @Override
//    public boolean raffle() {
//        System.out.println("扣了积分才能抽奖哦,");
//        return false;
//    }
//
//    //当前状态不能发放奖品,因为连奖都没抽
//    @Override
//    public void dispensePrize() {
//        System.out.println("不能发放奖品");
//    }
//}
