package hf.dp.strategyPattern;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack(); // 생성할 때 StrategyPattern.Quack 해줬네
        flyBehavior = new FlyWithWings(); // 마찬가지.
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard StrategyPattern.Duck");
    }
}
