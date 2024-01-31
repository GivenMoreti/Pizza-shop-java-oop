public class CheesePizza extends Pizza {
    String toppings;    //cheese toppings

    CheesePizza(String toppings,String name,double price){
        super(name,price);
        this.toppings = toppings;
    }

    String getCheesePizza(){
        return this.name + " "+ this.toppings;
    }
//for editing purposes
    void setCheesePizza(String cheeseType){
        this.toppings = cheeseType;
        System.out.printf("New toppings %s applied successfully 😊",this.toppings);

    }
}
