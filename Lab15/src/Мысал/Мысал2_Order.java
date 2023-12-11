package Мысал;

public class Мысал2_Order {
private int orderId;
private float amount;
public Мысал2_Order(int orderId, float amount){
    super();
    this.orderId = orderId;
    this.amount = amount;
}
public int getOrderId(){
    return orderId;
}

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    @Override
    public String toString(){
    return "Order [orderId = " + orderId + ", amount = " + amount + "]";
}
}
