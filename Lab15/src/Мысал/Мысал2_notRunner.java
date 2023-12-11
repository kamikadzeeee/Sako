package Мысал;
import Мысал.Мысал2_Item;
import java.util.ArrayList;
import Мысал.Мысал2_Order;
public class Мысал2_notRunner {
    public static void main(String[] args) {
        ArrayList<Object> rav = new ArrayList<>(){
            {
                add(new Мысал2_Order(231, 12.f));
                add(new Мысал2_Item(23331, 120.f, "Kerox"));
                add(new Мысал2_Order(259, 1.7f));
            }
        };


        Мысал2_Order or1 = (Мысал2_Order) rav.get(0);
        Мысал2_Order or2 = (Мысал2_Order) rav.get(1);  // Исправлено на Мысал2_Order
        Мысал2_Order or3 = (Мысал2_Order) rav.get(2);

        for (Object ob : rav) {
            System.out.println("rav: " + ob);
        }
    }
}
