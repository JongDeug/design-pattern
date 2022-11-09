package hf.dp.factoryPattern;

public class ChicagoStyleCheesePizza extends Pizza{
   public ChicagoStyleCheesePizza(){
       name = "Chicago Style Deep Dish and Chees Pizza";
       dough = "Extra Thick Crust Dough";
       sauce = "Plum Tomato Sauce";
       toppings.add("Shredded Mozzarella Cheese");
   }
   void cut(){
       System.out.println("Cutting the pizza into square slices");
   }
}
