public class Shop {
    String location;
    String shopName;

    Shop(String location,String shopName){
        this.location = location;
        this.shopName = shopName;
    }

    public String getShop(){
        return this.location + " " + this.shopName;
    }

    public void setShop(String newName){
        this.shopName = newName;
        System.out.println(shopName);
    }
}
