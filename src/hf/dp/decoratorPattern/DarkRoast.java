package hf.dp.decoratorPattern;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast";
    }

    public double cost(){
        return 10;
    }
}
