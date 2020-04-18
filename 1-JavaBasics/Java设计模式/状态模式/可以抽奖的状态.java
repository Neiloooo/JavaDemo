//package Java设计模式.状态模式;
//
//import java.util.Random;
//
///**
// * @Auther: liushuo
// * @Description: 可以抽奖的状态类
// * @version: 1.0
// */
//public class 可以抽奖的状态 extends State{
//
//    RaffleActivity activity;
//
//    //构造方法
//    public 可以抽奖的状态(RaffleActivity activity){
//        this.activity=activity;
//    }
//
//    //已经扣除了积分,不能再扣了
//    @Override
//    public void deductMoney() {
//        System.out.println("已经扣取过积分了");
//    }
//
//    //可以抽奖,调用抽奖方法后,根据实际情况,改变成新的状态
//    @Override
//    public boolean raffle() {
//        System.out.println("正在抽奖,请稍等!");
//        Random random = new Random();
//        int i = random.nextInt(10);
//        //10%的机会中奖
//        if (i == 0){
//            //抽中了更改状态,返回true
//            //改变活动转改为发放奖品context
//            activity.setState(activity.getDispenseState());
//            return  true;
//        }else {
//            System.out.println("很遗憾没有抽中讲评!");
//            //改状态为不能抽奖的状态
//            activity.setState(activity.getNoRaffleState());
//            return false;
//        }
//    }
//
//    //只有领奖的时候能够发放奖品
//    @Override
//    public void dispensePrize() {
//        System.out.println("没有中奖,不能发放奖品");
//    }
//}
