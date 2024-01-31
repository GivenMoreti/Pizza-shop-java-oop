import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class User {
    String username;
    Pizza pizza;
    Shop shop;
//    array must accept an obj
    ArrayList<Pizza> orders = new ArrayList<>();
    User(String username){
        this.username = username;
    }

//    user action eg order pizza,edit order,cancel order,etc

    void order(Pizza pizza){
        System.out.println("hi " + this.username);
        orders.add(pizza);
    }

    void cancelOrder(Pizza pizza){
        System.out.println("you are about to cancel your order, press Y to confirm");
        Scanner answer = new Scanner(System.in);
        String userResponse = answer.nextLine();
        if(Objects.equals(userResponse, "Y")){
            orders.remove(pizza);
        }else{
            System.out.println("you did not cancel");
        }

    }
    void changeShop(Shop newShop){
        this.shop = newShop;
        System.out.printf("you want to switch from %s to %s", this.shop,newShop);
    }



}
