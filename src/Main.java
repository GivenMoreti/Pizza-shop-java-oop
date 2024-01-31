import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner option = new Scanner(System.in);
        int userOption;

        Pizza pizza1 = new Pizza("bbq ",29.99);
        User user1 = new User("Kim");
        Shop shop1 = new Shop("plz","Pizza hut");

        do{
            menu();
            userOption = option.nextInt();
            switch (userOption) {
                case 1 -> user1.order(pizza1);
                case 2 -> user1.cancelOrder(pizza1);
                case 3 -> user1.changeShop(shop1);

                default -> System.out.println("invalid selection");
            }

        }while(userOption != 4);

    }

    public static void menu(){
        System.out.println(" Menu");
        System.out.println("1. Order Pizza");
        System.out.println("2. Cancel order");
        System.out.println("3. Edit order ");
        System.out.println("5. select a different shop");
        System.out.println("4. Exit");
    }
}