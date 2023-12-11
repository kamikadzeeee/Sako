package Мысал;

public class Мысал2_Item {
    private int itemId;
    private float price;
    private String name;
    public int getItemId(){
        return itemId;
    }
    public Мысал2_Item(int itemId,float price,String name){
        super();
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Item [itemId =" + itemId +" , price =" + price + " , name = " + name+"]";
    }
}
