package hf.dp.abstractFactoryPattern;


public class PizzaTestDrive {
    public static void main(String[] args){
        MyHWInfo.printInfo();
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza1.getName());
    }
}
