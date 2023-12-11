package Мысал;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Мысал3 {
    public static void main(String[] args){
        ArrayList<Мысал2_Order> orders = new ArrayList<Мысал2_Order>(){
            {
                add(new Мысал2_Order(231,21.f));
                add(new Мысал2_Order(713,11.f));
                add(new Мысал2_Order(259,1.7f));
            }
        };
        Мысал3_FindOrder fo = new Мысал3_FindOrder();
        List<Мысал2_Order> res = fo.findBiggerAmountOrder(10f,orders);
        System.out.println(res);
    }
}
