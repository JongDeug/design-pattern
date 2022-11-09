package hf.dp.factoryPattern;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
            return pizza;
        } else{
            System.out.println("Error: invalid type of pizza");
            return null;
        }
    }

}
