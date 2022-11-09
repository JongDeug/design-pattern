package hf.dp.factoryPattern;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
            return pizza; //return new ~();
        } else{
            System.out.println("Error: invalid type of pizza");
            return null;
        }
    }
}
