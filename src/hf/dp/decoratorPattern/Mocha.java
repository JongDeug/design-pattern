package hf.dp.decoratorPattern;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public java.lang.String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return 10 + beverage.cost();
    }
}
