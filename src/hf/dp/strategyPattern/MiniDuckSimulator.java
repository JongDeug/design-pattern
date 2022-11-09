package hf.dp.strategyPattern;

public class MiniDuckSimulator{
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        System.out.println("<<mallard duck>>");
        Duck mallard = new MallardDuck(); // mallard는 생성자에서 속성을 new 해줬음.
        mallard.performQuack();
        mallard.performFly();

        System.out.println("<<model duck>>");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}