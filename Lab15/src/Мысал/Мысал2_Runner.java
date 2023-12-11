package Мысал;
import Мысал.Мысал2_Item;
import java.util.ArrayList;
import Мысал.Мысал2_Order;
public class Мысал2_Runner {
    public static void main(String[] args) {
        ArrayList<Object> orders = new ArrayList<>(){
            {
                add(new Мысал2_Order(231, 12.f));
                add(new Мысал2_Item(23331, 120.f, "Kerox"));
                add(new Мысал2_Order(259, 1.7f));
            }
        };


        for (Object ob : orders) {
            System.out.println("rav: " + ob);
        }
    }
}
